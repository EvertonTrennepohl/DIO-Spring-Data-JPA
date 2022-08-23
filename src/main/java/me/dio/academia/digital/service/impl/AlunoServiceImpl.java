package me.dio.academia.digital.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.dto.AlunoDTO;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.mapper.AlunoMapper;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	private final AlunoMapper alunoMapper = AlunoMapper.INSTANCE;

	@Override
	public AlunoDTO create(AlunoDTO form) {
		Aluno aluno = alunoMapper.toModel(form);
		return alunoMapper.toDTO(alunoRepository.save(aluno));
	}

	@Override
	public AlunoDTO get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlunoDTO> getAll() {
		List<Aluno> alunos = alunoRepository.findAll();
		return alunos.stream().map(alunoMapper::toDTO).collect(Collectors.toList());
	}

	@Override
	public AlunoDTO update(Long id, AlunoDTO alunoDTO) {
		Aluno aluno = alunoMapper.toModel(alunoDTO);
		return alunoMapper.toDTO(alunoRepository.save(aluno));
	}

	@Override
	public void delete(Long id) {
		if(alunoRepository.existsById(id)) {
			alunoRepository.deleteById(id);
		}
		else {
			System.out.println("Aluno não existe no banco de dados");
		}
	}

}
