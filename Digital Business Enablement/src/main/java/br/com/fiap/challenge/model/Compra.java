package br.com.fiap.challenge.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COMPRA")
    private Long id;

    @NotNull(message = "O valor total não pode estar em branco")
    @Column(name = "VAL_COMPRA")
    private Double valor_total;

    @NotNull(message = "A data não pode estar em branco")
    @Column(name = "DT_COMPRA")
    private LocalDate data_compra;

    @NotNull(message = "O código não pode estar em branco")
    @Column(name = "COD_COMPRA")
    private int cod_contrato;

    
}
