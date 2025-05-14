import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChanged {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Changer");
        String[] colors = {"White", "Red", "Green", "Blue", "Yellow"};
        JComboBox<String> colorBox = new JComboBox<>(colors);

        // Panel to change background color
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE); // default color

        // Listener to change background color when selection changes
        colorBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String selected = (String) e.getItem();
                    switch (selected) {
                        case "Red": panel.setBackground(Color.RED); break;
                        case "Green": panel.setBackground(Color.GREEN); break;
                        case "Blue": panel.setBackground(Color.BLUE); break;
                        case "Yellow": panel.setBackground(Color.YELLOW); break;
                        default: panel.setBackground(Color.WHITE);
                    }
                }
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(colorBox, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
