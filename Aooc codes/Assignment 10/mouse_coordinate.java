import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class mouse_coordinate{
    public static void main(String args[])
    {
        JFrame frame=new JFrame("Mouse Co-ordinate");
        JLabel label=new JLabel("move mouse",SwingConstants.CENTER);
        frame.setVisible(true);

        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());
        frame.add(label,BorderLayout.CENTER);

        frame.addMouseMotionListener(new MouseMotionAdapter()
        {
            public void mouseMoved(MouseEvent e)
            {
                label.setText("x:"+ e.getX() +"y:"+e.getY());
            }
        });

    }
}