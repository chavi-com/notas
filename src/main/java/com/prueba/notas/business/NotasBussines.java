package com.prueba.notas.business;

import com.prueba.notas.domain.EstudianteDto;
import com.prueba.notas.domain.Notasdto;

import java.util.List;

public interface NotasBussines {
    public List<Notasdto> obtenerNotas();
    public Boolean crearNotas(Notasdto dto);
    public Boolean actualizarNotas(Notasdto dto);
    public Boolean eliminarNotas(Notasdto dto);

}
