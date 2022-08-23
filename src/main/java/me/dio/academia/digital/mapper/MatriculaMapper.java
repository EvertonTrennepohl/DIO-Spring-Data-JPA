package me.dio.academia.digital.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import me.dio.academia.digital.dto.MatriculaDTO;
import me.dio.academia.digital.entity.Matricula;

@Mapper
public interface MatriculaMapper {

	MatriculaMapper INSTANCE = Mappers.getMapper(MatriculaMapper.class);
	
	Matricula toModel(MatriculaDTO matriculaDTO);
	
	MatriculaDTO toDTO(Matricula matricula);
}
