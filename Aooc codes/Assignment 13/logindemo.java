import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class logindemo extends JFrame implements ActionListener
{
    JButton b1,b2;
    JLabel un,pw;
    JTextField t1, tpw;
    public logindemo()
    {
        setTitle("loginform");
        un=new JLabel("username");
        pw=new JLabel("password");
        t1=new JTextField(20);
        tpw=new JTextField(20);
        b1=new JButton("Register");
        b2=new JButton("login");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(un);add(t1);add(pw);add(tpw);
        add(b1);add(b2);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    { String u,p;
        try
        {  Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection ("jdbc:mysql://localhost/cse?useSSL=false",
                    "root","root");
            Statement st=con.createStatement();
            Statement st1=con.createStatement();
            if(e.getSource()==b1)
            { u=t1.getText();    p=tpw.getText();
                st.executeUpdate("insert into logint values('"+u+"','"+p+"')");
                JOptionPane.showMessageDialog(this,"you are successfully
                        registered","Register",JOptionPane.INFORMATION_MESSAGE);
            }
            if(e.getSource()==b2)
            {   u=t1.getText();
                p=tpw.getText();
                ResultSet rs=st1.executeQuery("select * from logint where
                        username='"+u+"'and password='"+p+"' ");
                int count=0;
                while(rs.next())
                { count++; }
                if(count==1)
                { JOptionPane.showMessageDialog(null,"login successful
                        ","login",JOptionPane.INFORMATION_MESSAGE);
                }
                else
                { JOptionPane.showMessageDialog(null,"login unsuccessful
                        ","login",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }//end of try
        catch(Exception e1){}
    }//end of actionperformed
    public static void main(String args[])
    {   logindemo ob=new logindemo();
    }//end of main
}//end of class 