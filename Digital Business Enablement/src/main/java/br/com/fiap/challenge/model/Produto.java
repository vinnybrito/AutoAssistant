package br.com.fiap.challenge.model;

import jakarta.persistence.Column;

//import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PRODUTO")
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    private String nome;

    @NotBlank
    @Column(name = "DESC_PRODUTO")
    private String desc;
    
    @Positive(message = "O valor deve ser positivo")
    @NotNull(message = "O valor não pode estar em branco")
    @Column(name = "VAL_PRODUTO")
    private Double valor;

    @NotBlank(message = "A qualidade não pode estar em branco")
    @Column(name = "QLD_PRODUTO")
    private String qualidade;

    @NotBlank(message = "A condição não pode estar em branco")
    @Column(name = "CON_PRODUTO")
    private String condicao_entrega;

    @Positive(message = "A quantidade deve ser positiva")
    @NotNull(message = "A quantidade não pode estar em branco")
    @Column(name = "QTD_PRODUTO")
    private int quantidade;


}
