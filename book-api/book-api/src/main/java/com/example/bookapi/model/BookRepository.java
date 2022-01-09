package com.example.bookapi.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,String> {
    Optional<Book> findBookByTitle(String titulo);
}
