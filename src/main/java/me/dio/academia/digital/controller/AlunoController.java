package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl alunoService;
	
	@GetMapping()
	public List<Aluno> getAll() {
		return alunoService.getAll();
	}
	
	@PostMapping
	public Aluno save(@RequestBody AlunoForm alunoForm) {
		return alunoService.create(alunoForm);
	}
	
	@PutMapping("/{id}")
	public Aluno update(@PathVariable Long id, @RequestBody AlunoUpdateForm alunoForm) {
		return alunoService.update(id, alunoForm);
	}
}
