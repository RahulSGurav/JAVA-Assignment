import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String args[]) {
        JFrame f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 500);
        f.setLayout(new BorderLayout());

        JLabel l1 = new JLabel("Welcome to Calculator", SwingConstants.CENTER);
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        f.add(l1, BorderLayout.NORTH);

        JTextField textField = new JTextField();
        textField.setFont(new Font("Arial",Font.BOLD, 24));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        f.add(textField, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5)); // 5 rows now for extra buttons

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+",
                "%", "x²", "√", "x³"
        };

        double[] num1 = new double[1];
        String[] operator = new String[1];

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial",Font.BOLD, 20));
            buttonPanel.add(btn);

            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String btnText = e.getActionCommand();

                    if (btnText.matches("[0-9]")) {
                        textField.setText(textField.getText() + btnText);
                    } else if ("+-*/%".contains(btnText)) {
                        num1[0] = Double.parseDouble(textField.getText());
                        operator[0] = btnText;
                        textField.setText("");
                    } else if (btnText.equals("=")) {
                        double num2 = Double.parseDouble(textField.getText());
                        double result = 0;
                        switch (operator[0]) {
                            case "+": result = num1[0] + num2; break;
                            case "-": result = num1[0] - num2; break;
                            case "*": result = num1[0] * num2; break;
                            case "/": result = num2 != 0 ? num1[0] / num2 : 0; break;
                            case "%": result = num1[0] % num2; break;
                        }
                        textField.setText(String.valueOf(result));
                    } else if (btnText.equals("C")) {
                        textField.setText("");
                    } else if (btnText.equals("x²")) {
                        double val = Double.parseDouble(textField.getText());
                        textField.setText(String.valueOf(val * val));
                    } else if (btnText.equals("√")) {
                        double val = Double.parseDouble(textField.getText());
                        textField.setText(String.valueOf(Math.sqrt(val)));
                    } else if (btnText.equals("x³")) {
                        double val = Double.parseDouble(textField.getText());
                        textField.setText(String.valueOf(val * val * val));
                    }
                }
            });
        }

        f.add(buttonPanel, BorderLayout.SOUTH);
        f.setVisible(true);
    }
}
