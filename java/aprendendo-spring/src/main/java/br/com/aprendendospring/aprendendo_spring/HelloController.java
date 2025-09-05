package br.com.aprendendospring.aprendendo_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 1. Diz ao Spring que esta classe é um controlador REST
@RequestMapping("/api") // 2. Define o caminho base para "/api"
public class HelloController {

    // 3. M apeia este método para requisições GET em "/api/saudacao"
    @GetMapping("/saudacao")
    public String saudar() {
        return "Olá do nosso primeiro endpoint Spring Boot!";
    }
}