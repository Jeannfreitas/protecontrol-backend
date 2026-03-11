package com.protecontrol.backend.repository;

import com.protecontrol.backend.model.Pedido;
import com.protecontrol.backend.model.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedido status);
    List<Pedido> findByDentistaId(Long dentistaId);
    List<Pedido> findByPagoFalse();
}