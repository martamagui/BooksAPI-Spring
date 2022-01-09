package com.example.bookapi.model;

import org.springframework.stereotype.Service;

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
}
