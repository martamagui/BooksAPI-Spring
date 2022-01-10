package com.example.bookapi.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Bookstable,String> {
    @Query("SELECT s FROM Bookstable s WHERE s.titulo=?1")
    Optional<Bookstable> findBookByTitle(String titulo);


}
