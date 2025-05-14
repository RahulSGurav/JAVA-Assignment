import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GridSwap extends JFrame {
    JButton[] buttons = new JButton[6];
    JButton firstClicked = null;

    public GridSwap() {
        setTitle("GridLayout Swap Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 3));

        // Create 6 buttons with numbers 1 to 6
        for (int i = 0; i < 6; i++) {
            buttons[i] = new JButton(String.valueOf(i + 1));
            buttons[i].addActionListener(new SwapListener());
            add(buttons[i]);
        }

        setVisible(true);
    }

    // Listener class to handle swap logic
    class SwapListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton clicked = (JButton) e.getSource();

            if (firstClicked == null) {
                firstClicked = clicked;
            } else {
                // Swap texts
                String temp = firstClicked.getText();
                firstClicked.setText(clicked.getText());
                clicked.setText(temp);
                firstClicked = null; // reset for next swap
            }
        }
    }

    public static void main(String[] args) {
        new GridSwap();
    }
}
