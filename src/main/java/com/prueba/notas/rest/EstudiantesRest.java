package com.prueba.notas.rest;

import com.prueba.notas.business.EstudiantesBussines;
import com.prueba.notas.domain.EstudianteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/estudiantes/api/v1")
public class EstudiantesRest {
    @Autowired
    EstudiantesBussines estudiantesBussines;
    @GetMapping("obtenerestudiantes")
    public List<EstudianteDto> obtenerestudiantes(){

        return estudiantesBussines.obtenerEstudiantes();

    }
    @PostMapping("/crearEstudinates")
    public Boolean crearEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.crearEstudiantes(dto);

    }
    @PutMapping("/actualizarEstudiantes")
    public Boolean actualizarEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.actualizarEstudiantes(dto);

    }
    @DeleteMapping("/eliminarEstudiantes")
    public Boolean eliminarEstudiantes(@RequestBody EstudianteDto dto){

        return estudiantesBussines.eliminarEstudiantes(dto);
    }

}
