package com.prueba.notas.rest;

import com.prueba.notas.business.GeneroBussines;
import com.prueba.notas.domain.GeneroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Genero/api/v1")
public class GeneroRest {
    @Autowired
    GeneroBussines generoBussines;
    @GetMapping("obtenergenero")
    public List<GeneroDto> obtenerGenero(){

        return generoBussines.obtenerGenero();

    }
    @PostMapping("/crearGenero")
    public Boolean crearGenero(@RequestBody GeneroDto dto){


        return generoBussines.crearGenero(dto);

    }
    @PutMapping("/actualizarGenero")
    public Boolean actualizarGenero(@RequestBody GeneroDto dto){

        return generoBussines.actualizarGenero(dto);

    }
    @DeleteMapping("/eliminargenero")
    public Boolean eliminarGenero(@RequestBody GeneroDto dto){

        return generoBussines.eliminarGenero(dto);
    }

}
