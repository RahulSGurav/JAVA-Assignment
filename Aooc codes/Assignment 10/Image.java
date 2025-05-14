import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Image {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Viewer");
        String[] imageNames = {"apple.png", "banana.png", "orange.png"};

        JComboBox<String> comboBox = new JComboBox<>(imageNames);
        JLabel imageLabel = new JLabel();

        // Load and display selected image
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    ImageIcon icon = new ImageIcon((String) e.getItem());
                    imageLabel.setIcon(icon);
                }
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(comboBox, BorderLayout.NORTH);
        frame.add(imageLabel, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
