package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.UsuarioInfo;

public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Long> { }
