package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Compra;


public interface CompraRepository extends JpaRepository<Compra, Long>{
    
}
