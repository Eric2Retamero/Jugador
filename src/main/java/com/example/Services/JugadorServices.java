package com.example.Services;

import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 8/10/15.
 */


@Service
@Transactional
public class JugadorServices {

    @Autowired
    private JugadorRepository jugadorRepository; //para que sirve esto??

    public void testJugador() {

    Calendar calendar = GregorianCalendar.getInstance();

    calendar.set(1995, Calendar.JANUARY, 9);
    Jugador jugador_01 = new Jugador("Derrick Rose", calendar.getTime(), 50, 80, 5, "Base");
    jugadorRepository.save(jugador_01);

    calendar.set(1998, Calendar.JULY, 11);
    Jugador jugador_02 = new Jugador("Eric Retamero", calendar.getTime(), 100, 20, 10, "Escolta");
    jugadorRepository.save(jugador_02);

    calendar.set(1999, Calendar.FEBRUARY, 1);
    Jugador jugador_03 = new Jugador("Kobe Bryant", calendar.getTime(), 50, 50, 10, "Alero");
    jugadorRepository.save(jugador_03);

    calendar.set(1980, Calendar.OCTOBER, 23);
    Jugador jugador_04 = new Jugador("Marc Gasol", calendar.getTime(), 30, 20, 60, "Ala-Pivot");
    jugadorRepository.save(jugador_04);

    calendar.set(2000, Calendar.DECEMBER, 10);
    Jugador jugador_05 = new Jugador("Pau Gasol", calendar.getTime(), 10, 20, 80, "Pivot");
    jugadorRepository.save(jugador_05);

        System.out.println(jugadorRepository.findByNameLike("Eric"));
        System.out.println(jugadorRepository.findByNumCanastasTotalGreaterThanEqual(20));
        System.out.println(jugadorRepository.findByNumAsistenciasTotalesBetween(20, 100));
        System.out.println(jugadorRepository.findByPosicionIs("Base"));
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calendar.getTime()));
        System.out.println(jugadorRepository.findByNumCanastasTotalGreaterThanEqualAndFechaNacimientoLessThan(20, calendar.getTime()));

    }


}
