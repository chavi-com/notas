package com.prueba.notas.maper;

import com.prueba.notas.domain.AsignaturaDto;
import com.prueba.notas.model.Asignatura;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AsignaturaMaper {
    public Asignatura fromDtoToEntity(AsignaturaDto dto){
        Asignatura entity = new Asignatura();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;

    }
    public AsignaturaDto fromentityToDto(Asignatura entity){
        AsignaturaDto dto = new AsignaturaDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
    public List<Asignatura>  ListadoAsignatura (List<AsignaturaDto> ListaDto){
        List<Asignatura> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<AsignaturaDto> listadoAsignaturaDto(List<Asignatura> listarAsignatura){
        List<AsignaturaDto> listaDto = new ArrayList<>();
        listarAsignatura.forEach(x -> listaDto.add((fromentityToDto(x))));

        return listaDto;
    }
}
