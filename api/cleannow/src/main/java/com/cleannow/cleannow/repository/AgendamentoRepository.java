package com.cleannow.cleannow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cleannow.cleannow.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
