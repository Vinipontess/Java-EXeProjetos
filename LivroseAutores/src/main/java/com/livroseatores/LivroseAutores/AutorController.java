package com.livroseatores.LivroseAutores;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.AutoWired;
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
@RequestMapping("/autores")
public class AutorController {
    private final AutorRepository autorRepository;

    @AutoWired // Contrutor com injeção de dependência do repositório JPA
    public AutorController(AutorRepository autorRepository) {
        this.autorRepository = autorRepository;
    }


    @GetMapping
    public List<Autor> getAllAutores(){
        return autorRepository.findAll();
    }

    @GetMapping("{id}")
    public Autor getAutorById(@PathVariable Long id){
        return autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado com id: " + id));
    }

    @PostMapping
    public ResponseEntity<Autor> createAutor(@RequestBody Autor autor){
        Autor autorSalvo = autorRepository.save(autor);
        return ResponseEntity.status(HttpStatus.CREATED).body(autorSalvo);
    }

    @PutMapping("{id}")
    public Autor updateAutor(@PathVariable Long id, @RequestBody Autor alteracoesAutor){
        Autor autorExistente = autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado com id: " + id));
        autorExistente.setNome(alteracoesAutor.getNome());
        return autorRepository.save(autorExistente);
    }  

    @DeleteMapping("{id}")
    public ResponseEntity<void> deleteAutor(@PathVariable Long id){
        Autor autorExistente = autorRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor não encontrado com id: " + id));
        autorRepository.delete(autorExistente);
        return ResponseEntity.noContent().build();
    }
}