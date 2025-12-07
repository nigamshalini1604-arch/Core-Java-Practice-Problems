package org.example.oopsPractice.librarybookmanagementsystem;

import java.util.ArrayList;

//Build a Library class to manage a list of Book objects.
// Implement methods to add, remove, and display books.
// Use constructors to initialize book details and manage the collection using an ArrayList.
public class Library {
    ArrayList<Book> books = new ArrayList<>();
    //Methods to add books
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }
    //Method to remove books
    public void removeBook(Book book){
        books.remove(book);
        System.out.println("Book removed: " + book.getTitle());
    }
    //Method to display books
    public void displayBooks(){
        System.out.println("Books in the library:");
        for(Book book :books)
        {
            System.out.println(book.toString());
        }
    }

}
