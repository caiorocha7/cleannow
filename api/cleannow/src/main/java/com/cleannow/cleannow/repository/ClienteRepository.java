package com.cleannow.cleannow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleannow.cleannow.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
