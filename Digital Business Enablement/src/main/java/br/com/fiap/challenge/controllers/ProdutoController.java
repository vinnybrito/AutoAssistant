package br.com.fiap.challenge.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import br.com.fiap.challenge.model.Produto;
import br.com.fiap.challenge.repository.ProdutoRepository;
//import jakarta.validation.Valid;

@RestController
public class ProdutoController {
    Logger log = LoggerFactory.getLogger(getClass());

    List <Produto> produtos = new ArrayList<>();

    @Autowired
    ProdutoRepository repository;

    @GetMapping("/produto")
    public List<Produto> index(){
        return repository.findAll();
    }

    @PostMapping("/produto")
    public ResponseEntity<Object> create(@RequestBody @Valid Produto produto) {
        log.info("Cadastrando produto - " + produto);
        repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

        @GetMapping("/produto/{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id){
        log.info("Mostrar produto com id " + id);
        return ResponseEntity.ok(getProdutoById(id));
    }

    @DeleteMapping("/produto/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("Apagando produto com id " + id);
        repository.delete(getProdutoById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/produto/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto){
        log.info("Atualizando dados do aluno com id " + id);
        getProdutoById(id);
        produto.setId(id);
        repository.save(produto);

        return ResponseEntity.ok(produto);
    }


    private Produto getProdutoById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
