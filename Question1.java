import java.util.*;
public class Question1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while(true){
            System.out.println("Enter the option to perform the following operation:");
            System.out.println("1.Adding a book to library");
            System.out.println("2.Deleting a book from library");
            System.out.println("3.Display the books");
            System.out.println("4.Replace a book with a new book");
            System.out.println("5.Search a book in the library");
            System.out.println("6.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:{
                    Book b=new Book();
                    System.out.println("Enter the details of the book");
                    System.out.println("Enter the BookId:");
                    int bookId=sc.nextInt();
                    b.setBookId(bookId);
                    sc.nextLine();
                    System.out.println("Enter the Title:");
                    String bookTitle=sc.nextLine();
                    b.setTitle(bookTitle);
                   
                    System.out.println("Enter the Author:");
                    String author=sc.nextLine();
                    b.setAuthor(author);
                    System.out.println("Enter true if the book is available or false if it is not available");
                    boolean available=sc.nextBoolean();
                    b.setAvailable(available);
                    library.addBook(b);
                    break;
                }
                case 2:{
                    System.out.println("Enter the BookId:");
                    int bookId=sc.nextInt();
                    library.removeBook(bookId);
                    break;
                }
                case 3:{
                    library.displayBooks();
                    break;
                }
                case 4:{
                    System.out.println("Enyter the BookId of the book to be replaced");
                    int oldBookId = sc.nextInt();
                    sc.nextLine();
                    Book b=new Book();
                    System.out.println("Enter the details of the new book");
                    System.out.println("Enter the BookId of new book:");
                    int bookId=sc.nextInt();
                    b.setBookId(bookId);
                    sc.nextLine();
                    System.out.println("Enter the Title of new book:");
                    String bookTitle=sc.nextLine();
                    b.setTitle(bookTitle);
                    System.out.println("Enter the Author of new book :");
                    String author=sc.nextLine();
                    b.setAuthor(author);
                    System.out.println("Enter true if the book is available or false if it is not available");
                    boolean available=sc.nextBoolean();
                    b.setAvailable(available);
                    library.replaceBook(oldBookId, b);
                    break;
                }
                case 5:{
                    System.out.println("Enter the BookId:");
                    int bookId=sc.nextInt();
                    library.searchBook(bookId);
                    break;
                }
                case 6:{
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Invalid option");
                    break;
                }
                
            }

    }
}
}