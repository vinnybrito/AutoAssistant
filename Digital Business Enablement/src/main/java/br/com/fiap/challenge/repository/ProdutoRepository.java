package br.com.fiap.challenge.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
    
}
