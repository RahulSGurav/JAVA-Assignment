import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Timers{
    public static int count=0;
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Simple Timer");
        JLabel label=new JLabel("Time: 0",SwingConstants.CENTER);

        frame.setSize(300,150);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout());
        frame.add(label,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton startbt =new JButton("Start");
        JButton stopbt =new JButton("Stop");

        Timer timer=new Timer(1000,e->{
           count++;
           label.setText("time: "+count);
        });

        startbt.addActionListener(e->{
           if(!timer.isRunning())
           {
               timer.start();
           }
        });
        stopbt.addActionListener(e->{
           timer.stop();
        });

       JPanel panel=new JPanel();
       panel.add(startbt);
       panel.add(stopbt);
       frame.add(panel,BorderLayout.SOUTH);
    }
}