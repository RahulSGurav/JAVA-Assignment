import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConverterGUI extends JFrame {
    private JTextField inputField, resultField;

    public ConverterGUI() {
        setTitle("Number Converter");
        setSize(400, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // NORTH: Input panel
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(new JLabel("Enter the number"));
        inputField = new JTextField(10);
        inputPanel.add(inputField);
        add(inputPanel, BorderLayout.NORTH);

        // CENTER: Buttons panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 3, 10, 10)); // 1 row, 3 columns
        JButton binaryBtn = new JButton("Binary");
        JButton octalBtn = new JButton("Octal");
        JButton hexBtn = new JButton("Hex");
        buttonPanel.add(binaryBtn);
        buttonPanel.add(octalBtn);
        buttonPanel.add(hexBtn);
        add(buttonPanel, BorderLayout.CENTER);

        // SOUTH: Result panel
        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new FlowLayout());
        resultPanel.add(new JLabel("Result"));
        resultField = new JTextField(15);
        resultField.setEditable(false);
        resultPanel.add(resultField);
        add(resultPanel, BorderLayout.SOUTH);

        // Action Listeners for buttons
        binaryBtn.addActionListener(e -> convert("binary"));
        octalBtn.addActionListener(e -> convert("octal"));
        hexBtn.addActionListener(e -> convert("hex"));

        setVisible(true);
    }

    private void convert(String type) {
        try {
            int num = Integer.parseInt(inputField.getText().trim());
            String result = switch (type) {
                case "binary" -> Integer.toBinaryString(num);
                case "octal" -> Integer.toOctalString(num);
                case "hex" -> Integer.toHexString(num).toUpperCase();
                default -> "";
            };
            resultField.setText(result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new ConverterGUI();
    }
}
