package com.prueba.notas.domain;

import java.util.List;

public class AsignaturaDto {
    Long id;
    String name;
    List<EstudianteDto> estudiantes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
