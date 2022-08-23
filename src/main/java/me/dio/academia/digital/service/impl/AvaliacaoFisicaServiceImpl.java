package me.dio.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.academia.digital.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.dto.AvaliacaoFisicaUpdateDTO;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.repository.AlunoRepository;
import me.dio.academia.digital.repository.AvaliacaoFisicaRepository;
import me.dio.academia.digital.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

	@Autowired
	private AvaliacaoFisicaRepository avaliacaoRepository;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public AvaliacaoFisica create(AvaliacaoFisicaDTO form) {
		
		AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
		avaliacaoFisica.setAluno(alunoRepository.findById(form.getAlunoId()).get());
		avaliacaoFisica.setAltura(form.getAltura());
		avaliacaoFisica.setPeso(form.getPeso());
		return avaliacaoRepository.save(avaliacaoFisica);
	}

	@Override
	public AvaliacaoFisica get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AvaliacaoFisica> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateDTO formUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
