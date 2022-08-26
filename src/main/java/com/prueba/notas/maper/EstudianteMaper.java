package com.prueba.notas.maper;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.domain.EstudianteDto;
import com.prueba.notas.model.Asignatura;
import com.prueba.notas.model.Estudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class EstudianteMaper {
    @Autowired
    GeneroMaper generoMaper;
    @Autowired
    AsignaturaMaper asignaturaMaper;

    public Estudiantes fromDtoToEntity(EstudianteDto dto){
        Estudiantes entity = new Estudiantes();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setGenero(generoMaper.fromDtoToEntity(dto.getGeneroDto()));
        List<Asignatura> asignaturaEntity=dto.getAsignaturas().stream().map(asignaturaMaper::fromDtoToEntity).collect(Collectors.toList());
        entity.setAsignaturas(asignaturaEntity);

        return entity;

    }
    public EstudianteDto fromentityToDto(Estudiantes entity){
        EstudianteDto dto = new EstudianteDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setGeneroDto(generoMaper.fromentityToDto(entity.getGenero()));
        List<AsignaturaDto> asignaturaDto=entity.getAsignaturas().stream().map(asignaturaMaper::fromentityToDto).collect(Collectors.toList());
        dto.setAsignaturas(asignaturaDto);

        return dto;
    }
    public List<Estudiantes> ListadoEstudiantes(List<EstudianteDto> ListaDto){
        List<Estudiantes> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<EstudianteDto> listadoEstudianteDto(List<Estudiantes> listarEstudiantes){
        List<EstudianteDto> listaDto = new ArrayList<>();
        listarEstudiantes.forEach(x -> listaDto.add((fromentityToDto(x))));

        return listaDto;
    }


}
