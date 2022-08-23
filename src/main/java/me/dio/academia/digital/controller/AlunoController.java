package me.dio.academia.digital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.dio.academia.digital.dto.AlunoDTO;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoServiceImpl alunoService;
	
	@GetMapping()
	public List<AlunoDTO> getAll() {
		return alunoService.getAll();
	}
	
	@PostMapping
	public AlunoDTO save(@RequestBody AlunoDTO alunoDTO) {
		return alunoService.create(alunoDTO);
	}
	
	@PatchMapping("/{id}")
	public AlunoDTO update(@PathVariable Long id, @RequestBody AlunoDTO alunoDTO) {
		return alunoService.update(id, alunoDTO);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		alunoService.delete(id);
	}
}
