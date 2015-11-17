package com.example.Repository;

import com.example.Model.Jugador;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


import java.util.Date;
import java.util.List;

/**
 * Created by jhipster on 8/10/15.
 */


public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {

    public Jugador findByName(String nombre);

    public List<Jugador> findByNameLike(String nombre);
    public List<Jugador> findByNumCanastasTotalGreaterThanEqual(int canastas);
    public List<Jugador> findByNumAsistenciasTotalesBetween(int asistencias_min, int asistencias_max);
    public List<Jugador> findByPosicionIs(String posicion);
    public List<Jugador> findByFechaNacimientoLessThan(Date fecha);
    public List<Jugador> findByNumCanastasTotalGreaterThanEqualAndFechaNacimientoLessThan(int canastas, Date fecha);

    //Jugadore de un equipo
    @Query("select j from Jugador j where j.equipo.name=:nombreEquipo")
    public List<Jugador> findByNombreEquipo (@Param("nombreEquipo") String nombreEquipo);

    //Jugadores de un equipo y posicion
    @Query("select j from Jugador j where j.equipo.name=:nombreEquipo and j.posicion=:posicion")
    public List<Jugador> findByNombreEquipoAndPosition (@Param("nombreEquipo") String nombreEquipo, @Param("posicion") String posicion);

    //Top anotador
    @Query("select j from Jugador j where j.id = (select max(j.id) from Jugador j)")
    public List<Jugador> findByMaximoAnotador();

    //Top5 anotadores
    @Query("select j from Jugador j order by j.numAsistenciasTotales desc")
    public List<Jugador> findByTopFiveAss(Pageable p);

    //Top anotador equipo determinado
    @Query("select j from Jugador j where j.equipo.name=:nombreEquipo")
    public List<Jugador>findByMaximoAnotadorEquipo(@Param("nombreEquipo") String nombreEquipo);

}
