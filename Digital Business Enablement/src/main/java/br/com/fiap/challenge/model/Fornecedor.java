package br.com.fiap.challenge.model;

import jakarta.persistence.Column;

//import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FORNECEDOR")
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Column(name = "NM_FORNECEDOR")
    private String nome;

    @NotBlank(message = "O CNPJ não pode estar em branco")
    @Size(min = 14, max = 14, message = "O CNPJ deve ter 14 numeros")
    @Column(name = "CNPJ_FORNECEDOR")
    private String cnpj;

    @NotBlank(message = "O telefone não pode estar em branco")
    @Column(name = "TEL_FORNECEDOR")
    private String telefone;

    @NotBlank(message = "A reputação não pode estar em branco")
    @Column(name = "REP_FORNECEDOR")
    private String reputacao;
    
}
