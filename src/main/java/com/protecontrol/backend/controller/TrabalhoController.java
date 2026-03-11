package com.protecontrol.backend.controller;

import com.protecontrol.backend.model.Trabalho;
import com.protecontrol.backend.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/trabalhos")
@CrossOrigin(origins = "*")
public class TrabalhoController {

    @Autowired
    private TrabalhoService service;

    @GetMapping
    public List<Trabalho> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Trabalho buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Trabalho salvar(@RequestBody Trabalho trabalho) {
        return service.salvar(trabalho);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}