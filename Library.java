
package com.mycompany.library;

public class Library {
    
    String BookName;
    String AuthorName;
    int Quantity;
    
    Library (String BookName, String AuthorName, int Quantity)
    {
        this.BookName= BookName;
        this.AuthorName= AuthorName;
        this.Quantity= Quantity;
    }
    
    void Display()
    {
        System.out.println("This is: " +BookName+ "\n" +AuthorName+ "\n" +Quantity);
    }
    
    void returnBook()
    {
        Quantity++;
        System.out.println("The Head First Java : book is returned . Now the Quantity is: "+Quantity);
    }
    
    void issueBook()
    {
        Quantity = Quantity-5;
        System.out.println("The" +BookName+ "issued. Now the Quantity is: " +Quantity);
    }

    public static void main(String[] args) {
        Library Book = new Library("Head first Java" , "Sumitra", 10);
        Book.Display();
        Book.issueBook();
        Book.Display();
        Book.returnBook();
        Book.Display();
    }
}
