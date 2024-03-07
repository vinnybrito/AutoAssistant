package br.com.fiap.challenge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UsuarioInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO_DETALHE")
    private Long id;

    @NotBlank(message = "O cpf dever 11 digitos")
    @Size(min = 11, max = 11, message = "O CPF deve ter 11 numeros")
    @Column(name = "CPF_USUARIO")
    private String cpf;

    @NotBlank(message = "O nome não pode estar em branco")
    @Column(name = "NM_USUARIO")
    private String nome;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 8, max = 8, message = "O CEP deve ter 8 numeros")
    @Column(name = "CEP_USUARIO")
    private String cep;

    @Positive(message = "O numero deve ser positivo")
    @NotNull
    @Column(name = "NUM_USUARIO")
    private int numero;

    @NotBlank(message = "O complemento não pode estar em branco")
    @Column(name = "COM_USUARIO")
    private String complemento;

    @NotBlank(message = "O logradouro não pode estar em branco")
    @Column(name = "LOG_USUARIO")
    private String logradouro;

    @NotBlank(message = "O telefone não pode estar em branco")
    @Column(name = "TEL_USUARIO")
    private String telefone;
    
}
