package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.dto.AlunoDTO;

public interface IAlunoService {
  /**
   * Cria um Aluno e salva no banco de dados.
   * @param form - formulário referente aos dados para criação de um Aluno no banco de dados.
   * @return - Aluno recém-criado.
   */
  AlunoDTO create(AlunoDTO alunoDTO);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   * @param id - id do Aluno que será exibido.
   * @return - Aluno de acordo com o Id fornecido.
   */
  AlunoDTO get(Long id);

  /**
   * Retorna todos os Alunos que estão no banco de dados.
   * @return - Uma lista os Alunos que estão salvas no DB.
   */
  List<AlunoDTO> getAll();

  /**
   * Atualiza o Aluno.
   * @param id - id do Aluno que será atualizado.
   * @param alunoDTO - formulário referente aos dados necessários para atualização do Aluno
   * no banco de dados.
   * @return - Aluno recém-atualizado.
   */
  AlunoDTO update(Long id, AlunoDTO alunoDTO);

  /**
   * Deleta um Aluno específico.
   * @param id - id do Aluno que será removido.
   */
  void delete(Long id);
}
