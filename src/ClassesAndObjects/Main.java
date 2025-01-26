package ClassesAndObjects;

public class Main {
    public static void main(String[] args) {




        Book HeadFirstJava = new Book("Head First Java",  "Jhn Doe", "123-1627");
        Book HeadFirstJavaSecondEdition = new Book("Head First Java 2nd edition",  "Jane Doe", "6404-4832");
        System.out.println(HeadFirstJava);
        System.out.println(HeadFirstJavaSecondEdition);
    }


}
// 2.3.2. Inheritance
// Inheritance is the mechanism in Java by which one class acquires the properties and functionalities of another class. The class that is inherited is called the superclass, and the class that inherits the superclass is called the subclass.
// Inheritance is a key concept in OOP, as it allows us to create a new class that is based on an existing class. The new class inherits the properties and methods of the existing class, and can also have its own properties and methods.
// In Java, we use the keyword extends to indicate that a class is a subclass of another class.
