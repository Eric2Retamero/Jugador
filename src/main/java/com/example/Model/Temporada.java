package com.example.Model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 21/10/15.
 */

@Entity
public class Temporada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int año;

    @ManyToMany // union tabla equipo, propiedad inversa
    private Set<Equipo> equipos = new HashSet<>();

    @ManyToOne
    private Liga liga; //union tabla liga. propriedad propietaria

    public Temporada(){}

    public Temporada(int año){
        this.año=año;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Set<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(Set<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }
}
