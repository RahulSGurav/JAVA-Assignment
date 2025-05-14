import javax.swing.*;
import java.awt.event.*;

public class StationaryPurcheseSystem {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Stationary Purchase System");
        frame.setSize(350, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create checkboxes
        JCheckBox notebookBox = new JCheckBox("Notebook @ 50");
        notebookBox.setBounds(50, 30, 200, 20);

        JCheckBox penBox = new JCheckBox("Pen @ 30");
        penBox.setBounds(50, 60, 200, 20);

        JCheckBox pencilBox = new JCheckBox("Pencil @ 10");
        pencilBox.setBounds(50, 90, 200, 20);

        // Create order button
        JButton orderButton = new JButton("Order");
        orderButton.setBounds(100, 130, 100, 30);

        // Add components to frame
        frame.add(notebookBox);
        frame.add(penBox);
        frame.add(pencilBox);
        frame.add(orderButton);

        // Button event
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double total = 0;
                StringBuilder msg = new StringBuilder();

                if (notebookBox.isSelected()) {
                    String input = JOptionPane.showInputDialog(frame, "Enter Quantity for Notebook:");
                    int qty = Integer.parseInt(input);
                    total += qty * 50;
                    msg.append("Notebook Quantity: ").append(qty).append("  Total: ").append(qty * 50).append("\n");
                }

                if (penBox.isSelected()) {
                    String input = JOptionPane.showInputDialog(frame, "Enter Quantity for Pen:");
                    int qty = Integer.parseInt(input);
                    total += qty * 30;
                    msg.append("Pen Quantity: ").append(qty).append("  Total: ").append(qty * 30).append("\n");
                }
                if (pencilBox.isSelected()) {
                    String input = JOptionPane.showInputDialog(frame, "Enter Quantity for Pencil:");
                    int qty = Integer.parseInt(input);
                    total += qty * 10;msg.append("Pencil Quantity: ").append(qty).append("  Total: ").append(qty * 10).append("\n");
                }
                msg.append("--------------------\nTotal: ").append(total);
                JOptionPane.showMessageDialog(frame, msg.toString(), "Message", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(frame, "Successfully Ordered.", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        });

        frame.setVisible(true);
    }
}
