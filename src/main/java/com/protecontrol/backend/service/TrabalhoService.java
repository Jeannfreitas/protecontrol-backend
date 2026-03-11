package com.protecontrol.backend.service;

import com.protecontrol.backend.model.Trabalho;
import com.protecontrol.backend.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repository;

    public List<Trabalho> listarTodos() {
        return repository.findAll();
    }

    public Trabalho salvar(Trabalho trabalho) {
        return repository.save(trabalho);
    }

    public Trabalho buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Trabalho não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}