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
import br.com.fiap.challenge.model.Fornecedor;
import br.com.fiap.challenge.repository.FornecedorRepository;
//import jakarta.validation.Valid;

@RestController
public class FornecedorController {

    Logger log = LoggerFactory.getLogger(getClass());

    List <Fornecedor> fornecedor = new ArrayList<>();

    @Autowired
    FornecedorRepository repository;

    @GetMapping("/fornecedor")
    public List<Fornecedor> index(){
        return repository.findAll();
    }

    @PostMapping("/fornecedor")
    public ResponseEntity<Object> create(@RequestBody @Valid Fornecedor fornecedor) {
        log.info("Cadastrando fornecedor - " + fornecedor);
        repository.save(fornecedor);
        return ResponseEntity.status(HttpStatus.CREATED).body(fornecedor);
    }

    @GetMapping("/fornecedor/{id}")
    public ResponseEntity<Fornecedor> show(@PathVariable Long id){
        log.info("mostrar fornecedor com id " + id);
        return ResponseEntity.ok(getFornecedorById(id));
    }

    @DeleteMapping("/fornecedor/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("Apagando fornecedor com id " + id);
        repository.delete(getFornecedorById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/fornecedor/{id}")
    public ResponseEntity<Fornecedor> update(@PathVariable Long id, @RequestBody Fornecedor fornecedor){
        log.info("Atualizando dados do fornecedor com id " + id);
        getFornecedorById(id);
        fornecedor.setId(id);
        repository.save(fornecedor);

        return ResponseEntity.ok(fornecedor);
    }


    private Fornecedor getFornecedorById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
