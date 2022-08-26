package com.prueba.notas.model;

import javax.persistence.*;

@Entity
@Table(name = "notas")
public class Notas{
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private float notas;

    @ManyToOne
    @JoinColumn(name = "asignatura_id")
    private Asignatura asignatura;

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
