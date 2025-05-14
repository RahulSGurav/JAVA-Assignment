import java.util.*;
import java.sql.*;
import java.lang.*;
class MyJDBC
{
    public static void main(String[]args)
    {
        int roll,ch;
        float mark;
        String name;
        Scanner s=new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cse?useSSL=false","r
                    oot","root");
                    Statement str=con.createStatement();
            System.out.println("conneted to student");
            do
            {
                System.out.print("\n1.SELECT\n2.INSERT\n3.UPDATE\n4.DELETE\n0.EXIT");
                System.out.print("\nEnter your choice:=");
                ch=s.nextInt();
                System.out.println();
                switch(ch)
                {
                    case 1://select using executeQuery
                        ResultSet r1=str.executeQuery("select * from student");
                        while(r1.next())
                        {
                            roll=r1.getInt(1);
                            name=r1.getString(2);
                            mark=r1.getFloat(3);
                            System.out.println(roll+"\t"+name+"\t"+mark);
                        }
                        break;
                    case 2:
                        System.out.println("INSERT DATA");
                        System.out.println("Roll number:=");
                        roll=s.nextInt();
                        System.out.println("name:=");
                        name=s.next();
                        System.out.println("mark:=");
                        mark=s.nextInt();
                        str.executeUpdate("insert into student values("+roll+",'"+name+"',"+mark+")");
                        break;
                    case 3:
                        System.out.println("UPDATE DATA");
                        System.out.println("Enter the roll number whose marks to be updated:=");
                        roll=s.nextInt();
                        System.out.println("new marks:=");
                        mark=s.nextInt();
                        str.executeUpdate("update student set marks="+mark+" where rollno="+roll+" ");
                        break;
                    case 4:
                        System.out.println("Enter the roll number whose record to be DELETED:=");
                        roll=s.nextInt();
                        str.executeUpdate("delete from student where rollno="+roll+" ");
                        break;
                    case 0:
                        break;
                }
            }while(ch!=0);
        }
        catch(Exception e)
        {   System.out.println(e); }
    }
}