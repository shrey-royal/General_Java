class Book {
    private String title;
    private String author;
    private String ISBN;
    private Boolean isAvailable;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isAvailable = true;
    }

    //getter setter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public Boolean isAvailable() {
        return isAvailable;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Book is Not Available");
        }
    }

    public void checkIn() {
        if(!isAvailable) {
            isAvailable = true;
        } else {
            System.out.println("Book is already in the shelve");
        }
    }
}

class Library {
    private Book[][] shelves;

    public Library(int numRows, int numCols) {
        shelves = new Book[numRows][numCols];
    }

    public void addBook(int row, int col, Book book) {
        shelves[row][col] = book;
    }

    public void removeBook(int row, int col) {
        shelves[row][col] = null;
    }

    public Book getBook(int row, int col) {
        return shelves[row][col];
    }
}

public class ArrayTask {
    public static void main(String[] args) {
        Library library = new Library(3, 3);
        
        library.addBook(0, 0, new Book("To Kill a MockingBird", "Harper Lee", "978-0-06-112008-4"));
        library.addBook(0, 1, new Book("The Great Gatsby", "F.Scott Fitzgerald", "978-0-7432-7356-5"));
        library.addBook(0, 2, new Book("The Da Vinci Code", "Dan Brown", "978-0-307-27377-5"));
        library.addBook(1, 0, new Book("The Hobbit", "J.R.R. Tolkein", "978-0-345-33968-3"));
        library.addBook(1, 1, new Book("Sapiens: A Brief History of HumanKind", "Yuval Noah Harari", "978-0-06-231609-7"));

        library.getBook(0, 2).checkOut();
        // library.getBook(0, 2).checkOut();
        
        library.getBook(0, 2).checkIn();

        // System.out.println(library.getBook(0, 0).getTitle());
    }
}
/*
Problem Statement: Create a Java program that manages a library's collection of books using a 2D array of Book objects. Implement the following functionality:

1. Create a Book class with attributes like title, author, ISBN, and availability status.
2. Initialize a 2D array to represent the library's shelves and books. Each element in the array should hold a Book object.
3. Implement methods to add new books to the library's collection, remove books, and update book information.
4. Allow users to check out and return books. Update the availability status accordingly.
5. Provide a way to search for books by title, author, or ISBN and display relevant information.
6. Ensure that the program can display the entire library's catalog, including available and checked-out books.
7. Handle exceptions, such as attempting to check out a book that is already checked out or trying to remove a book that does not exist in the library.

This problem statement combines the concepts of classes and objects with 2D arrays in Java to create a library management system.


*/