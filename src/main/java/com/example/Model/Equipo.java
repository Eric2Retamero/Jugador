package com.example.Model;
import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by jhipster on 21/10/15.
 */

@Entity
public class Equipo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    protected String name;

    @Column
    protected String localidad;

    @Column
    protected Date fecha;

    @OneToMany(mappedBy="equipo") //union con la tabla jugador, propiedad inversa (1:N)
    private Set<Jugador> jugadores = new HashSet<>();


    @ManyToMany(mappedBy="equipos") //union con la tabla temporadas, propiedad inversa (N:M)
    private Set<Temporada> temporadas = new HashSet<>();



    public Equipo(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Equipo(String name, String localidad, Date fecha){
         this.name=name;
         this.localidad=localidad;
         this.fecha=fecha;
     }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<Jugador> getJugadores() {
        return jugadores;
    } //

    public void setJugadores(Set<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Set<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(Set<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}
