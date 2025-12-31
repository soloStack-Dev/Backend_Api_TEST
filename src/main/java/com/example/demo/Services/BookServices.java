package com.example.demo.Services;

import org.springframework.stereotype.Service;

import com.example.demo.Model.Books;
import com.example.demo.Repository.BookRepo;

@Service
public class BookServices {
    private final BookRepo bookRepo;

    public BookServices(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


     public void addBook(Books book) {
        bookRepo.save(book);
    }

     public Books getBook(Long bookid) {
        return bookRepo.findById(bookid).orElse(null);
    }

     public void deleteBook(Long bookid) {
        bookRepo.deleteById(bookid);
    }

     public void updateBook(Books book) {
        bookRepo.save(book);
    }

    public Iterable<Books> getAllBooks() {
        return bookRepo.findAll();
    }

}
