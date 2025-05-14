import LibraryManagement.Book;
import LibraryManagement.Member;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Book Title:");
        String title= sc.nextLine();
        System.out.println("Enter Book Author:");
        String author= sc.nextLine();
        System.out.println("Enter Book ISBN:");
        String isbn= sc.nextLine();

        Book book=new Book(title, author, isbn);


        System.out.println("Enter Member name:");
        String name= sc.nextLine();
        System.out.println("Enter Member id:");
        String memberId= sc.nextLine();

        Member member=new Member(name , memberId);


        System.out.println("-----Book Details-----");
        book.displyBook();

        System.out.println("-----Member Details-----");
        member.displyMember();



    }
}
