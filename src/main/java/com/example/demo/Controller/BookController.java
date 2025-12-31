package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Books;
import com.example.demo.Services.BookServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class BookController {

    private final BookServices bookServices;

    public BookController(BookServices bookServices) {
        this.bookServices = bookServices;
    }

    @PostMapping("/addBook")
    public void addBook(@RequestBody Books book) {
        bookServices.addBook(book);
    }

    @GetMapping
    ("/getBook/{bookid}")
    public Books getBook(@PathVariable Long bookid) {
        return bookServices.getBook(bookid);
    }

    @DeleteMapping("/deleteBook/{bookid}")
    public void deleteBook(@PathVariable Long bookid) {
        bookServices.deleteBook(bookid);
    }

    @PutMapping("/updateBook")
    public void updateBook(@RequestBody Books book) {
        bookServices.updateBook(book);
    }

    @GetMapping("/getAllBooks")
    public Iterable<Books> getAllBooks() {
        return bookServices.getAllBooks();
    }
}
