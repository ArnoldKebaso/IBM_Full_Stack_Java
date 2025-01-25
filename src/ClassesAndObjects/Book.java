package ClassesAndObjects;

public class Book {

    public String tittle;
    public String author;
    public String isbn;

    //our constructor scope
    public Book(String tittle, String author, String isbn){
        this.tittle = tittle;
        this.author = author;
        this.isbn = isbn;

    }

    public void  displayBookInfo(){
        System.out.println("Tittle" +  tittle);
        System.out.println("Author" + author);
        System.out.println("isbn"+ isbn);
    }

    @Override
    public String toString(){
        return "Book Title :" + tittle;
    }
}
