public class Library {

    private Book books[]=new Book[5];
    private int count=0;

    //method to add book to Libtrary
    public void addBook(Book book){
        if(count==books.length){
            System.out.println("Sorry,No space for adding the book to Library");
        }else{
            books[count]=book;
            count++;
            System.out.println("Book added successfully.");
        }
    }

    public void removeBook(int bookId){
        if(count==0){ //if there are no books to delete
            System.out.println("No books to delete");
        }else{
            for(int i=0;i<count;i++){
                if(books[i].getBookId()==bookId){
                    if(i==count-1){
                        count--;
                        System.out.println("Book removed successfully.");
                        break;//setting the last book to null
                    }else{
                        for (int j = i; j < count-1 ; j++) {
                            books[j] = books[j + 1];
                        }
                    }
                    count--; // Decrease the count of books
                    System.out.println("Book removed successfully.");
                }
            }
        }
    }

    public void displayBooks(){
        System.out.println("The books in the library are as follows:");
        for(int i=0;i<count;i++){
            System.out.println(books[i]);
        }
    }

    //method to search a book by its id
    public void searchBook(int bookId){
        for(int i=0;i<count;i++){
            if(books[i].getBookId()==bookId){
                System.out.println("The book you searched for:");
                System.out.println(books[i]);
                
                break;
            }
        }
    }
    //method to replace a book by its id
    public void replaceBook(int bookId,Book book){
        for(int i=0;i<count;i++){
            if(books[i].getBookId()==bookId){
                books[i]=book;
                System.out.println("Book replaced successfully.");
                break;
            }
        }
    }

    
}
