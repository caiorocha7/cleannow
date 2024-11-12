package com.cleannow.cleannow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleannow.cleannow.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
