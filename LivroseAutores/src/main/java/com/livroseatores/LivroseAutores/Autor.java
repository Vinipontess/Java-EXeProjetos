package com.livroseatores.LivroseAutores;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Autor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    //Construtor vazio por conta do JPA
    public Autor() {
    }
    
    //Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    //setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}