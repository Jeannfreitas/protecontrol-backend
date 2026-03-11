package com.protecontrol.backend.service;

import com.protecontrol.backend.model.Pedido;
import com.protecontrol.backend.model.StatusPedido;
import com.protecontrol.backend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public List<Pedido> listarPorStatus(StatusPedido status) {
        return repository.findByStatus(status);
    }

    public List<Pedido> listarNaoPagos() {
        return repository.findByPagoFalse();
    }

    public Pedido salvar(Pedido pedido) {
        pedido.setDataEntrada(LocalDate.now());
        pedido.setPago(false);
        pedido.setStatus(StatusPedido.EM_PRODUCAO);
        return repository.save(pedido);
    }

    public Pedido atualizarStatus(Long id, StatusPedido novoStatus) {
        Pedido pedido = buscarPorId(id);
        pedido.setStatus(novoStatus);
        if (novoStatus == StatusPedido.RECEBIDO) {
            pedido.setPago(true);
        }
        return repository.save(pedido);
    }

    public Pedido buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
