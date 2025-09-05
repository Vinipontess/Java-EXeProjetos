package br.com.aprendendospring.aprendendo_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AprendendoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AprendendoSpringApplication.class, args);
		String nome = "Ponte";
		System.out.println("Olá, " + nome + "! Bem-vindo ao Spring Boot.");
	}

}
