package com.example.bookapi.model;

import javax.persistence.Column;
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
    //Cuidado con el camelCase en los nombres de las columnas, deben estar en minúsculas
    @Column(name="imgurl")
    private String imgUrl;

    public Bookstable(String titulo, String autor, String categoria, String precio, String imgUrl) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.precio = precio;
        this.imgUrl = imgUrl;
    }

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
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    @Override
    public String toString() {
        return "Bookstable{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio='" + precio + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}
