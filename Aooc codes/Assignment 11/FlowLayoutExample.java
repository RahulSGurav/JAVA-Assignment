import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set FlowLayout: LEFT aligned, hgap = 10, vgap = 20
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        // Create checkboxes
        JCheckBox javaBox = new JCheckBox("Java");
        JCheckBox pythonBox = new JCheckBox("Python");
        JCheckBox cppBox = new JCheckBox("C++");

        // Add checkboxes to frame
        frame.add(javaBox);
        frame.add(pythonBox);
        frame.add(cppBox);

        frame.setVisible(true);
    }
}
