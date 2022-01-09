package com.example.bookapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Bookstable {
    @Id
    private String titulo;
    private String autor;
    private String categoria;
    private String precio;
    //TODO revisar tipo del imgUrl


    //Sin imagen
    public Bookstable(String titulo, String autor, String categoria, String precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
    }


    public Bookstable() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}