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
    public List<Bookstable> getBooks() {
        return bookService.getBooks();
    }

    @PostMapping
    public void addBook(@RequestBody Bookstable bookstable) {
        bookService.addBook(bookstable);
    }

    @PutMapping(path="{titulo}")
    public void editBook(@PathVariable("titulo") String titulo,
                         @RequestParam(required = false) String autor,
                         @RequestParam(required = false) String categoria,
                         @RequestParam(required = false) String precio,
                         @RequestParam(required = false) String imgurl
                         ) {
        bookService.editBook(titulo, autor, categoria, precio, imgurl);

    }
    @DeleteMapping(path = "{titulo}")
    public void deleteBook(@PathVariable("titulo") String titulo){
        bookService.deleteBook(titulo);
    }
}
