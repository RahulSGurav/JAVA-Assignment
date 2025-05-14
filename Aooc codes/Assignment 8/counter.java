import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class counter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Counter");
        frame.setSize(450, 120);
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 15));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Counter");
        JTextField textField = new JTextField("0");
        textField.setPreferredSize(new Dimension(80, 25));

        JButton upButton = new JButton("Count Up");
        JButton downButton = new JButton("Count Down");
        JButton resetButton = new JButton("Reset");

        frame.add(label);
        frame.add(textField);
        frame.add(upButton);
        frame.add(downButton);
        frame.add(resetButton);

        upButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                value++;
                textField.setText("" + value);
            }
        });

        downButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int value = Integer.parseInt(textField.getText());
                value--;
                textField.setText("" + value);
            }
        });

        // Reset
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        frame.setVisible(true);
    }
}
