package me.dio.academia.digital.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateDTO {

  private String nome;

  private String bairro;

  private LocalDate dataDeNascimento;
}
