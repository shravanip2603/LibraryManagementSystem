package org.example;

public class Book {
    private String isbn; // Unique identifier for the book
    private String title; // Title of the book
    private String author; // Author of the book
    private int publicationYear; // Year the book was published
    private boolean isAvailable; // Flag indicating if the book is available for borrowing

    /**
     * Constructor to initialize a Book object with its details.
     * By default, the book is marked as available when added to the library.
     *
     * @param isbn           the unique ISBN of the book
     * @param title          the title of the book
     * @param author         the author of the book
     * @param publicationYear the year the book was published
     */
    public Book(String isbn, String title, String author, int publicationYear) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true; // When added, the book is available by default
    }

    // Getters and setters for the attributes

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    /**
     * Checks if the book is available for borrowing.
     *
     * @return true if the book is available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }
    /**
     * Sets the availability status of the book.
     *
     * @param available true if the book is available, false otherwise.
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + publicationYear +
                ", available=" + isAvailable +
                '}';
    }
}