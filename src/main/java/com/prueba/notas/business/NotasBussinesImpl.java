package com.prueba.notas.business;

import com.prueba.notas.domain.Notasdto;
import com.prueba.notas.maper.NotasMaper;
import com.prueba.notas.model.Notas;
import com.prueba.notas.repository.NotasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class NotasBussinesImpl implements NotasBussines{
    @Autowired
    NotasMaper maper;
    @Autowired
    NotasRepository repository;

    @Override
    public List<Notasdto> obtenerNotas() {

        List<Notasdto> listaDto = maper.listadoNotasDto(repository.findAll());
        return listaDto;
    }

    @Override
    public Boolean crearNotas(Notasdto dto) {


        Notas notas = maper.fromDtoToEntity(dto);
        repository.save(notas);

        return true;
    }

    @Override
    public Boolean actualizarNotas(Notasdto dto) {
        Notas notas = maper.fromDtoToEntity(dto);
        repository.save(notas);

        return true;
    }


    @Override
    public Boolean eliminarNotas(Notasdto dto) {
        Notas notas = maper.fromDtoToEntity(dto);
        repository.delete(notas);

        return true;
    }
}