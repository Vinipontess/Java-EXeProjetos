package com.catalogodelivros.CatalogoDeLivros;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    //meu construtor
    //Construtor vazio por conta do JPA
    public Livro() {
    }

    //Meus getters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    //Meus setters
    public void setId(Long id) {
        if(id <= 0) {
            throw new IllegalArgumentException("ID inválido. Deve ser maior que zero.");
        }
        this.id = id;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título não pode ser nulo ou vazio.");
        }
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        if(autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("Autor não pode ser nulo ou vazio.");
        }
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        if(anoPublicacao <= 0) {
            throw new IllegalArgumentException("Ano de publicação inválido. Deve ser maior que zero.");
        }
        this.anoPublicacao = anoPublicacao;
    }

}
