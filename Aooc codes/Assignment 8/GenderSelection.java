import javax.swing.*;
import java.awt.event.*;
public class GenderSelection
{
    public static void main(String[] args) {

        JFrame frame=new JFrame("Gender Selection");
        frame.setSize(300,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Select gender");
        label.setBounds(30,20,100,50);
        frame.add(label);

        JRadioButton male=new JRadioButton("Male");
        male.setBounds(30,50,100,30);
        frame.add(male);

        JRadioButton female=new JRadioButton("Female");
        female.setBounds(30,80,100,30);
        frame.add(female);

        ButtonGroup group=new ButtonGroup();
        group.add(male);
        group.add(female);

        JButton button=new JButton("Submit");
        button.setBounds(30,120,80,20);
        frame.add(button);

        JLabel l1=new JLabel("Selected:");
        l1.setBounds(30,150,150,30);
        frame.add(l1);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(male.isSelected())
                {
                    l1.setText("Selected:male");
                }
                else if(female.isSelected())
                {
                    l1.setText("Selected:female");
                }
                else{
                    l1.setText("Selectd:none");
                }
            }
        });


        frame.setVisible(true);
    }
}
