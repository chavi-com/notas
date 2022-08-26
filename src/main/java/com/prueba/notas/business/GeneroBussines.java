package com.prueba.notas.business;

import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.domain.GeneroDto;
import com.prueba.notas.model.Genero;

import java.util.List;

public interface GeneroBussines {
    public List<GeneroDto> obtenerGenero();
    public Boolean crearGenero(GeneroDto dto);
    public Boolean actualizarGenero(GeneroDto dto);
    public Boolean eliminarGenero(GeneroDto dto);
}
