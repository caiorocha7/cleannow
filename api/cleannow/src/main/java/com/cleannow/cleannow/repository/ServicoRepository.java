package com.cleannow.cleannow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleannow.cleannow.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
