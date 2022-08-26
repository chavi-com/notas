package com.prueba.notas.maper;

import com.prueba.notas.domain.Notasdto;
import com.prueba.notas.model.Notas;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class NotasMaper {
    public Notas fromDtoToEntity(Notasdto dto){
        Notas entity = new Notas();
        entity.setId(dto.getId());
       // entity.setName(dto.getName());
        return entity;

    }
    public Notasdto fromentityToDto(Notas entity){
        Notasdto dto = new Notasdto();
        dto.setId(entity.getId());
      //  dto.setName(entity.getName());
        return dto;
    }
    public List<Notas> ListadoNotas (List<Notasdto> ListaDto){
        List<Notas> listaEntity = new ArrayList<>();
        ListaDto.forEach(x -> listaEntity.add(fromDtoToEntity(x)));

        return listaEntity;

    }
    public List<Notasdto> listadoNotasDto(List<Notas> listarNotas){
        List<Notasdto> listaDto = new ArrayList<>();
        listarNotas.forEach(x -> listaDto.add((fromentityToDto(x))));

        return listaDto;
    }


}
