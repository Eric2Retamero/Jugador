package com.example.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 21/10/15.
 */

@Entity
public class Liga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nombre;

    @OneToMany(mappedBy="liga")
    private Set<Temporada> temporadas = new HashSet<>(); //Union con tabla Temporada, propriedad inversa

    public Long getId() {
        return id;
    }

    public Liga(){}
    public Liga(String nombre){
        this.nombre=nombre;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
