package com.example.bookapi.model;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Bookstable> getBooks() {
        return bookRepository.findAll();
    }
    public void addBook(Bookstable book){
        if(!bookRepository.findBookByTitle(book.getTitulo()).isPresent()){
            throw new IllegalStateException("This book already exists.");
        }else{
            bookRepository.save(book);
        }
    }
}
