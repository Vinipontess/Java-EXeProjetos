package com.livroseatores.LivroseAutores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.List;



@RestController
@RequestMapping("/livros")
public class LivroController{
    private final LivroRepository livroRepository;

    @Autowired
    public  LivroController(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public List<Livro> getAllLivros(){
        return livroRepository.findAll();
    }

    @GetMapping("{id}")
    public Livro getLivroById(@PathVariable long id){
        return livroRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public ResponseEntity<Livro> createLivro(@RequestBody Livro livro){
        Livro livroSalvo = livroRepository.save(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(livroSalvo);
    }

    @PutMapping("{id}")
    public Livro updateLivro(@PathVariable long id, @RequestBody Livro alteracaoLivro){
        Livro livroExistente = livroRepository.findById(id).orElseThrow();
        livroExistente.setTitulo(alteracaoLivro.getTitulo());
        livroExistente.setAutor(alteracaoLivro.getAutor());
        livroExistente.setAnoDePublicacao(alteracaoLivro.getAnoDePublicacao());
        livroExistente = livroRepository.save(livroExistente);
        return livroExistente;
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteLivro(@PathVariable long id){
        Livro livroExistente = livroRepository.findById(id).orElseThrow();
        livroRepository.delete(livroExistente);
        return ResponseEntity.noContent().build();
    }
}