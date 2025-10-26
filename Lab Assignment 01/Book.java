public class Book 
{
    String title;
    String author;
    double price;
//Constructor Overloading
    Book() 
    {
        
    }
    Book(String title, String author) 
    {
        this.title = title;
        this.author = author;
        this.price = 0.0; 
    }
    Book(String title, String author, double price) 
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayInfo() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    public static void main(String[] args) 
    {
        Book book1 = new Book();
        System.out.println("Using Default Constructor:");
        book1.displayInfo();

        Book book2 = new Book("The Alchemist", "Paulo Coelho");
        System.out.println("Using Constructor with Title and Author:");
        book2.displayInfo();

        Book book3 = new Book("Atomic Habits", "James Clear", 19.99);
        System.out.println("Using Constructor with Title, Author, and Price:");
        book3.displayInfo();
    }
}