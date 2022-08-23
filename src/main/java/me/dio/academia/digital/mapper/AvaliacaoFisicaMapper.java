package me.dio.academia.digital.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import me.dio.academia.digital.dto.AvaliacaoFisicaDTO;
import me.dio.academia.digital.entity.AvaliacaoFisica;

@Mapper
public interface AvaliacaoFisicaMapper {
	
	MatriculaMapper INSTANCE = Mappers.getMapper(MatriculaMapper.class);
	
	AvaliacaoFisica toModel(AvaliacaoFisicaDTO avaliacaoFisicaDTO);
	
	AvaliacaoFisicaDTO toDTO(AvaliacaoFisica avaliacaoFisica);
}
