package com.protecontrol.backend.service;

import com.protecontrol.backend.model.Dentista;
import com.protecontrol.backend.repository.DentistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DentistaService {

    @Autowired
    private DentistaRepository repository;

    public List<Dentista> listarTodos() {
        return repository.findAll();
    }

    public Dentista salvar(Dentista dentista) {
        return repository.save(dentista);
    }

    public Dentista buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dentista não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}