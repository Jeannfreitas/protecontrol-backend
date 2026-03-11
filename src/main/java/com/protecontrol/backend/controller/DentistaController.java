package com.protecontrol.backend.controller;


import com.protecontrol.backend.service.DentistaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.protecontrol.backend.model.Dentista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/dentistas")
@CrossOrigin(origins = "*")
public class DentistaController {

    @Autowired
    private DentistaService service;

    @GetMapping
    public List<Dentista> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Dentista buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Dentista salvar(@RequestBody Dentista dentista) {
        return service.salvar(dentista);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}