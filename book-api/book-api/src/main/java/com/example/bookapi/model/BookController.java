package com.example.bookapi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping
    public List<Bookstable> getBooks(){
        return bookService.getBooks();
    }
    @PostMapping
    public void addBook(@RequestBody Bookstable bookstable){
        bookService.addBook(bookstable);
    }
}
