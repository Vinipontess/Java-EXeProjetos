package com.catalogodelivros.CatalogoDeLivros;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private final LivroRepository livroRepository;

    @Autowired  //Aqui é feito o contrutor trazendo o contrutor do JPA 
    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    //Métodos

    @GetMapping //aqui utilizamos o Get com .findAll() trazendo todos os livros do "banco"
    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro novoLivro){
        return livroRepository.save(novoLivro);
    }

    @GetMapping("/{id}")
    public Livro getLivroById(@PathVariable Long id) {
        return livroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Livro não encontrado com ID: " + id));
    }

    @PutMapping("/{id}")
    public Livro atualizar(@PathVariable Long id, @RequestBody Livro livroAtualizado) {
        Livro livroExistente = livroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Livro não encontrado com ID: " + id));
        livroExistente.setTitulo(livroAtualizado.getTitulo());
        livroExistente.setAutor(livroAtualizado.getAutor());
        livroExistente.setAnoPublicacao(livroAtualizado.getAnoPublicacao());
        return livroRepository.save(livroExistente);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        Livro livroExistente = livroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Livro não encontrado com ID: " + id));
        livroRepository.delete(livroExistente);
        return "Livro deletado com sucesso.";
    }}

