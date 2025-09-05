package com.aprendendoJPAeH2.JPAeH2;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    //Pelo que entendi o JPA precisa de um construtor vazio
    public Usuario() {
    }

    //meus getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    //meus setters

    // Exemplo de setter profissional
    public void setNome(String novoNome) {
        if (novoNome == null || novoNome.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome não pode ser nulo ou vazio.");
        }
        this.nome = novoNome;
    }

    public void setEmail(String novoEmail){
        if(novoEmail != null && novoEmail.length() > 0 && novoEmail.contains("@")){
            this.email = novoEmail;
        }else{
            System.out.println("Email inválido, não pode ser nulo ou vazio e deve conter '@'");
        }
    }

}
