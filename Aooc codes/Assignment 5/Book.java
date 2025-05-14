package LibraryManagement;

public class Book {
    public String title;
    public String author;
    public String isbn;



    public  Book(String title,String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }

    public void displyBook()
    {
        System.out.println("Book Title:"+title);
        System.out.println("Book Author:"+author);
        System.out.println("ISBN:"+isbn);
    }
}
