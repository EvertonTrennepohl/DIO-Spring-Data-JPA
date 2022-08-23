package me.dio.academia.digital.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import me.dio.academia.digital.dto.AlunoDTO;
import me.dio.academia.digital.entity.Aluno;

@Mapper
public interface AlunoMapper {

	AlunoMapper INSTANCE = Mappers.getMapper(AlunoMapper.class);
	
	@Mapping(target = "dataDeNascimento", source = "dataDeNascimento", dateFormat = "dd-MM-yyyy")
	Aluno toModel(AlunoDTO alunoDTO);
	
	AlunoDTO toDTO(Aluno aluno);
	
}
