package LibraryManagement;

public class Member{

    public String name;
    public int memberId;


    public  Member(String name, String memberId)
    {
        this.name=name;
        this.memberId= Integer.parseInt(memberId);
    }

    public void displyMember()
    {
        System.out.println("Member Name:"+name);
        System.out.println("Member id:"+memberId);

    }
}
