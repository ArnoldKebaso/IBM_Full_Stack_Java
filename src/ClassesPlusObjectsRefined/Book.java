package ClassesPlusObjectsRefined;


public class Book {

    // Fields (attributes) of the Book class
    private String title;
    private String author;
    private String isbn;

    // Constructor to initialize the Book object
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Getter method for title
    public String getTitle() {
        return title;
    }

    // Setter method for title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for isbn
    public String getIsbn() {
        return isbn;
    }

    // Setter method for isbn
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Method to display book information
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Overriding the toString() method to provide a custom string representation of the Book object
    @Override
    public String toString() {
        return "Book Title: " + title;
    }
}