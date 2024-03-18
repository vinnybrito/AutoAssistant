/*package br.com.fiap.challenge.config;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.fiap.challenge.model.Compra;
import br.com.fiap.challenge.model.Fornecedor;
import br.com.fiap.challenge.model.Produto;
import br.com.fiap.challenge.model.UsuarioInfo;
import br.com.fiap.challenge.repository.CompraRepository;
import br.com.fiap.challenge.repository.FornecedorRepository;
import br.com.fiap.challenge.repository.ProdutoRepository;
import br.com.fiap.challenge.repository.UsuarioInfoRepository;

@Configuration
@Profile("dev")
public class DatabaseSeeder implements CommandLineRunner {

    @Autowired
    CompraRepository compraRepository;

    @Autowired
    FornecedorRepository fornecedorRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    UsuarioInfoRepository usuarioRepository;

    @Override
    public void run(String... args) throws Exception {


        Produto produto1 = new Produto(null, "Produto 1", "Descrição do Produto 1", 50.0, "Boa", "Entrega em até 7 dias", 10);
        Produto produto2 = new Produto(null, "Produto 2", "Descrição do Produto 2", 100.0, "Excelente", "Entrega em até 3 dias", 5);

        Fornecedor fornecedor1 = new Fornecedor(null, "Fornecedor 1", "12345678901234", "123456789", "Bom", produto1);
        Fornecedor fornecedor2 = new Fornecedor(null, "Fornecedor 2", "56789012345678", "987654321", "Ótimo", produto2);

        UsuarioInfo usuario1 = new UsuarioInfo(null, "12345678901", "Usuário 1", 
                "12345678", 123, "Complemento 1", "Rua A", "987654321");
        UsuarioInfo usuario2 = new UsuarioInfo(null, "98765432109", "Usuário 2",
                "87654321", 456, "Complemento 2", "Rua B", "123456789");

        Compra compra1 = new Compra(null, 100.0, LocalDate.now(), 123456);
        Compra compra2 = new Compra(null, 200.0, LocalDate.now().minusDays(5), 654321);

        fornecedorRepository.saveAll(List.of(fornecedor1, fornecedor2));
        produtoRepository.saveAll(List.of(produto1, produto2));
        usuarioRepository.saveAll(List.of(usuario1, usuario2));
        compraRepository.saveAll(List.of(compra1, compra2));
    }
}*/
