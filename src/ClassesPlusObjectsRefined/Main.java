package ClassesPlusObjectsRefined;


public class Main {
    public static void main(String[] args) {
        // Creating Book objects using the constructor
        Book headFirstJava = new Book("Head First Java", "John Doe", "123-1627");
        Book headFirstJavaSecondEdition = new Book("Head First Java 2nd edition", "Jane Doe", "6404-4832");

        // Displaying the book information using the displayBookInfo() method
        headFirstJava.displayBookInfo();
        headFirstJavaSecondEdition.displayBookInfo();

        // Using the toString() method to print the book objects
        System.out.println(headFirstJava);
        System.out.println(headFirstJavaSecondEdition);

        // Modifying the book information using setter methods
        headFirstJava.setTitle("Head First Java Updated");
        headFirstJava.setAuthor("John Smith");
        headFirstJava.setIsbn("987-6543");

        // Displaying the updated book information
        headFirstJava.displayBookInfo();
    }
}