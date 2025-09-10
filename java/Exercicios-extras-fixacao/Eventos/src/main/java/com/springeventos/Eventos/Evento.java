package com.springeventos.Eventos;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDate;
import jakarta.persistence.*;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private LocalDate data;
    private String local;

    // Construtores
    public Evento() {} //vazio por conta do JPA

    //Getters

    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public LocalDate getData() {
        return data;
    }
    public String getLocal() {
        return local;
    }

    //Setters

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public void setLocal(String local) {
        this.local = local;
    }




}
