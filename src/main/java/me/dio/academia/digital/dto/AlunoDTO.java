package me.dio.academia.digital.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoDTO {

	private Long id;

	private String nome;

	private String cpf;

	private String bairro;

	private LocalDate dataDeNascimento;

}
