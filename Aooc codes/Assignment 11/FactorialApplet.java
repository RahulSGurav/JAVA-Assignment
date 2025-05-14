import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="FactorialApplet" width="300" height="200">
</applet>
*/

public class FactorialApplet extends Applet implements ActionListener {
    TextField inputField;
    Button calculateButton;
    Label resultLabel;

    public void init() {
        setLayout(new FlowLayout());

        Label prompt = new Label("Enter a number:");
        inputField = new TextField(10);
        calculateButton = new Button("Calculate Factorial");
        resultLabel = new Label("Result: ");

        add(prompt);
        add(inputField);
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(inputField.getText());
            if (number < 0) {
                resultLabel.setText("Please enter a non-negative integer.");
                return;
            }
            if (number > 20) {
                resultLabel.setText("Number too large (overflow).");
                return;
            }

            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }

            resultLabel.setText("Result: " + fact);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input.");
        }
    }
}
