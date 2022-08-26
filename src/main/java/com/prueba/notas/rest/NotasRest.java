package com.prueba.notas.rest;

import com.prueba.notas.business.NotasBussines;
import com.prueba.notas.domain.Notasdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas/api/v1")

public class NotasRest {
    @Autowired
    NotasBussines notasBussines;
    @GetMapping("obtenernotas")
    public List<Notasdto> obtenernotas(){

        return notasBussines.obtenerNotas();

    }
    @PostMapping("/crearNotas")
    public Boolean crearNotas(@RequestBody Notasdto dto){

        return notasBussines.crearNotas(dto);

    }
    @PutMapping("/actualizarNotas")
    public Boolean actualizarNotas(@RequestBody Notasdto dto){

        return notasBussines.actualizarNotas(dto);

    }
    @DeleteMapping("/eliminarNotas")
    public Boolean eliminarNotas(@RequestBody Notasdto dto){

        return notasBussines.eliminarNotas(dto);
    }
}
