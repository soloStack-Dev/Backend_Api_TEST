package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Books {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long bookid;
    private String bookname;
    private String author;
    private int price;

    public Books() {

    }

    public Books(Long bookid, String bookname, String author, int price) {
        this.bookid = bookid;
        this.bookname = bookname;
        this.author = author;
        this.price = price;
    }

    public Long getBookid() {
        return bookid;
    }

    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
