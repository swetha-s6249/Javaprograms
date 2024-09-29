import java.util.*;
class Book{
        String bookname, isbn,author,publisher;
        Book(String bookname, String isbn,String author,String publisher){
        this.bookname = bookname;
        this.ISBN_num = isbn;
        this.author=author;
        this.publisher = publisher;
    }
    void setbokName(String bookname){
        this.bookname =  bookname;
    }
     String getbookName(){
        return bookname;
    }

    void setisbn(String isbn){
        this.isbn = isbn;
    }
    String getisbn(){
        return isbn;
    }

    void setAuthor(String author){
        this.author = author;
    }
     String getAuthor(){
        return author;
    }
    void setPublisher(String publisher){
        this.publisher = publisher;
    }
    String getPublisher(){
        return publisher;
    }

 }
class BookEx{
    public static void main(String s[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bookname , ISBN number, Author,Publisher: ");
        String name =sc.next(); 
        String ISBN_num=sc.next();
        String author=sc.next();
        String publisher=sc.next();
        Book b = new Book( nookname, isbn, author,publisher);
        System.out.println(b.getbookName());
        System.out.println(b.getisbn());
        System.out.println(b.getAuthor());
        System.out.println(b.getPublisher());
    }