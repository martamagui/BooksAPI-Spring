package com.example.bookapi.model;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public void addBook(Bookstable book) {
        if (bookRepository.findBookByTitle(book.getTitulo()).isPresent()) {
            throw new IllegalStateException("This book already exists.");
        } else {
            bookRepository.save(book);
        }
    }

    @Transactional
    public void editBook(String titulo, String autor, String categoria, String precio, String imgUrl) {
        if (bookRepository.findBookByTitle(titulo).isPresent()) {
            Bookstable book = bookRepository.findBookByTitle(titulo).get();
            if (autor != null && autor.length() >= 3) {
                book.setAutor(autor);
            }
            if (categoria != null && categoria.length() >= 3) {
                book.setCategoria(categoria);
            }
            if (precio != null && precio.length() >= 3) {
                book.setPrecio(precio);
            }
            if (imgUrl != null && imgUrl.length() >= 3) {
                book.setImgUrl(imgUrl);
            }
        }
    }

    public void deleteBook(String titulo) {
        if (bookRepository.findBookByTitle(titulo).isPresent()) {
            bookRepository.deleteById(titulo);
        } else {
            throw new IllegalStateException("El libro: " + titulo + " no existe.");
        }
    }
}
