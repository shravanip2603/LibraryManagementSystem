package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class Library {
    private List<Book> books; // List to store all books in the library


    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * Adds a new book to the library's collection.
     *
     * @param book the book to be added to the library
     */
    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> viewAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        // Filter out books that are available for borrowing
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
}



}