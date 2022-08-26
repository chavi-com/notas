package com.prueba.notas.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "estuduantes")
public class Estudiantes {

    @Column
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id",name = "id_genero")
    private Genero genero;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Asignatura> asignaturas;

    public Long getId() {
        return id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
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

