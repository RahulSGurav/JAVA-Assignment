import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextCount {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Counter");
        JTextArea textArea = new JTextArea();
        JLabel label = new JLabel("Characters: 0 | Words: 0");

        // Add KeyListener to update count in real-time
        textArea.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textArea.getText();
                int charCount = text.length();
                int wordCount = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;
                label.setText("Characters: " + charCount + " | Words: " + wordCount);
            }
        });

        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
