package com.example.Repository;
import com.example.Model.Jugador;
import org.springframework.data.repository.PagingAndSortingRepository;
import java.util.List;
import java.util.Date;

/**
 * Created by jhipster on 8/10/15.
 */


public interface JugadorRepository extends PagingAndSortingRepository<Jugador, Long> {
    public List<Jugador> findByNameLike(String nombre);
    public List<Jugador> findByNumCanastasTotalGreaterThanEqual(int canastas);
    public List<Jugador> findByNumAsistenciasTotalesBetween(int asistencias_min, int asistencias_max);
    public List<Jugador> findByPosicionIs(String posicion);
    public List<Jugador> findByFechaNacimientoLessThan(Date fecha);
    public List<Jugador> findByNumCanastasTotalGreaterThanEqualAndFechaNacimientoLessThan(int canastas, Date fecha);


}
