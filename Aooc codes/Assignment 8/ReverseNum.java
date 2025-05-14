import javax.swing.*;
import java.awt.event.*;
public class ReverseNum
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Reverse Number");
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Enter a Number:");
        label.setBounds(20,30,100,30);
        frame.add(label);

        JTextField input =new JTextField();
        input.setBounds(130,30,100,30);
        frame.add(input);

        JButton button =new JButton("Reverse");
        button.setBounds(80,80,100,30);
        frame.add(button);

        JLabel result=new JLabel("Reversed:");
        result .setBounds(30,110,200,30);
        frame.add(result);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                try{
                        int num=Integer.parseInt(input.getText());
                        int reversed=0;
                        while(num !=0)
                        {
                            int digit = num%10;
                            reversed = ( reversed*10 )+digit;
                            num/=10;
                        }
                        result.setText("Reversed:"+reversed);
                }catch(Exception f){
                    System.out.println(f);
                }
            }
    });

        frame.setVisible(true);
    }
}
