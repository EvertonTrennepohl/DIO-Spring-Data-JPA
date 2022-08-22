package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public Aluno create(AlunoForm form) {
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
		return alunoRepository.save(aluno);
	}

	@Override
	public Aluno get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> getAll() {
		return alunoRepository.findAll();
	}

	@Override
	public Aluno update(Long id, AlunoUpdateForm formUpdate) {
		Aluno aluno = new Aluno();
		aluno.setId(id);
		aluno.setNome(formUpdate.getNome());
		aluno.setBairro(formUpdate.getBairro());
		aluno.setDataDeNascimento(formUpdate.getDataDeNascimento());
		return alunoRepository.save(aluno);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
