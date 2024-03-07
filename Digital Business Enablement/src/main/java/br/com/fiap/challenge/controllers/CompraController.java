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

import br.com.fiap.challenge.model.Compra;
import br.com.fiap.challenge.repository.CompraRepository;
import jakarta.validation.Valid;

@RestController
public class CompraController {

     Logger log = LoggerFactory.getLogger(getClass());

    List <Compra> compra = new ArrayList<>();

    @Autowired
    CompraRepository repository;

    @GetMapping("/compra")
    public List<Compra> index(){
        return repository.findAll();
    }

    @PostMapping("/compra")
    public ResponseEntity<Object> create(@RequestBody @Valid Compra compra) {
        log.info("Cadastrando compra - " + compra);
        repository.save(compra);
        return ResponseEntity.status(HttpStatus.CREATED).body(compra);
    }

    @GetMapping("/compra/{id}")
    public ResponseEntity<Compra> show(@PathVariable Long id){
        log.info("mostrar compra com id " + id);
        return ResponseEntity.ok(getCompraById(id));
    }

    @DeleteMapping("/compra/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("Apagando compra com id " + id);
        repository.delete(getCompraById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/compra/{id}")
    public ResponseEntity<Compra> update(@PathVariable Long id, @RequestBody Compra compra){
        log.info("Atualizando dados da compra com id " + id);
        getCompraById(id);
        compra.setId(id);
        repository.save(compra);

        return ResponseEntity.ok(compra);
    }


    private Compra getCompraById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
