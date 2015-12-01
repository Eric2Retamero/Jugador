package com.example.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by jhipster on 8/10/15.
 */

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    protected String name;

    @Column
    protected Date fechaNacimiento;

    @Column
    protected int numCanastasTotal;

    @Column
    protected int numAsistenciasTotales;

    @Column
    protected int numRebotesTotales;

    @Column
    protected String posicion;


    @ManyToOne
    @JsonIgnore
    private Equipo equipo; //union con tabla equipo, propiedad propietaria(N:1)

    public Equipo getEquipo() {
        return equipo;
    } //funcion para devolver el numero el cual esta associado el jugador con el equipo

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    } //funcion que asocia el equipo al jugador

    public Jugador(){} //constructor vacio, si hay uno con parametros no hay que borrarlo sino se puede borrar

    public Jugador(String name, Date fechaNacimiento, int numCanastasTotal, int numAsistenciasTotales, int numRebotesTotales, String posicion){
        this.name=name;
        this.fechaNacimiento=fechaNacimiento;
        this.numCanastasTotal=numCanastasTotal;
        this.numAsistenciasTotales=numAsistenciasTotales;
        this.numRebotesTotales=numRebotesTotales;
        this.posicion=posicion;
        this.equipo=equipo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumCanastasTotal() {
        return numCanastasTotal;
    }

    public void setNumCanastasTotal(int numCanastasTotal) {
        this.numCanastasTotal = numCanastasTotal;
    }

    public int getNumAsistenciasTotales() {
        return numAsistenciasTotales;
    }

    public void setNumAsistenciasTotales(int numAsistenciasTotales) {
        this.numAsistenciasTotales = numAsistenciasTotales;
    }

    public int getNumRebotesTotales() {
        return numRebotesTotales;
    }

    public void setNumRebotesTotales(int numRebotesTotales) {
        this.numRebotesTotales = numRebotesTotales;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numCanastasTotal=" + numCanastasTotal +
                ", numAsistenciasTotales=" + numAsistenciasTotales +
                ", numRebotesTotales=" + numRebotesTotales +
                ", posicion='" + posicion + '\'' +
                ", equipo='" + equipo + '\'' +
                '}';
    }
}
