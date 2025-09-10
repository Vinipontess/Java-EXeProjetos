package com.springeventos.Eventos;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController 
public class EventoController {
    
    private final EventoRepository eventoRepository;
    @Autowired
    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @PostMapping("/eventos")
    public Evento criarEvento(@RequestBody Evento evento) {
        return eventoRepository.save(evento);
    }

    @GetMapping("/eventos")
    public List<Evento> listarEventos() {
        return eventoRepository.findAll();
    }

    @GetMapping("/eventos/{id}")
    public Evento obterEventoId(@PathVariable Long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    @PutMapping("/eventos/{id}")
    public Evento atualizarEvento(@PathVariable Long id, @RequestBody Evento eventoAtualizado) {
        return eventoRepository.findById(id).map(evento -> {
            evento.setNome(eventoAtualizado.getNome());
            evento.setData(eventoAtualizado.getData());
            evento.setLocal(eventoAtualizado.getLocal());
            return eventoRepository.save(evento);
        }).orElse(null);
    }

    @DeleteMapping("/eventos/{id}")
    public void deletarEvento(@PathVariable Long id) {
        eventoRepository.deleteById(id);
        return;
    }

}
