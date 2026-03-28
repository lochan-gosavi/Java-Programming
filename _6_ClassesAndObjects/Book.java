class Book{
    static int totalBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;
    
    static{
        totalBooks = 0;
    }
    {
        totalBooks++;
    }

    Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    Book(String isbn){
        this("Unknown", "Unknown", isbn);
    }

    void borrowBook(){
        if(isBorrowed == true){
            System.out.println("Book is already allocated to a reader!");
        }
        else
        {
            this.isBorrowed = true;
            System.out.println("Enjoy the book!");
        }
     }
    void returnBook(){
        if(isBorrowed == true){
            this.isBorrowed = false;
            System.out.println("Hope so you liked the book!");
        }
        else{
            System.out.println("Book is already in the library!");
        }
    }
   

    public static void main(String[] args){
        Book designingBook = new Book("Design", "abc", "1");
        Book mehndiArtbook = new Book("Mehendi", "xyz", "2");
        designingBook.borrowBook();
        designingBook.returnBook();
        // designingBook.borrowBook();
        // designingBook.borrowBook();
        // designingBook.borrowBook();
        designingBook.returnBook();

    }

}