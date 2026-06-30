package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBookService() {
        System.out.println("BookService: Adding book...");
        bookRepository.addBook();
    }

    public void displayBookService() {
        System.out.println("BookService: Displaying books...");
        bookRepository.displayBooks();
    }
}