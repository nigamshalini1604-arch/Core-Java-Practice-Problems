package org.example.oopsPractice.librarybookmanagementsystem;

public class LibraryMain {
    public static void main(String...args){
        Library library=new Library();
        Book book1=new Book("The Great Gatsby","F. Scott Fitzgerald","9780743273565");
        Book book2=new Book("To Kill a Mockingbird","Harper Lee","9780061120084");
        Book book3=new Book("1984","George Orwell","9780451524935");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.displayBooks();

        library.removeBook(book2);

        library.displayBooks();
    }
}
