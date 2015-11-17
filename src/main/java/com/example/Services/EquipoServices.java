package com.example.Services;
import com.example.Model.Equipo;
import com.example.Model.Jugador;
import com.example.Repository.EquipoRepository;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by jhipster on 21/10/15.
 */

@Service
@Transactional
public class EquipoServices {


    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private JugadorRepository jugadorRepository;


    public void testEquipo() {

        Calendar calendar = GregorianCalendar.getInstance();

        //creo el equipo
        calendar.set(1995, Calendar.JANUARY, 9);
        Equipo equipo_01 = new Equipo("C.B Sama", "Vilanova i la Geltru",calendar.getTime());
        equipoRepository.save(equipo_01);

        //asocio un jugador al equipo
        Jugador jugador_01 = jugadorRepository.findByName("Eric Retamero");
        jugador_01.setEquipo(equipo_01);
        jugadorRepository.save(jugador_01);

        calendar.set(1998, Calendar.JULY, 11);
        Equipo equipo_02 = new Equipo("C.B Sitges", "Sitges",calendar.getTime());
        equipoRepository.save(equipo_02);

        Jugador jugador_02 = jugadorRepository.findByName("Derrick Rose");
        jugador_02.setEquipo(equipo_02);
        jugadorRepository.save(jugador_02);

        calendar.set(1999, Calendar.FEBRUARY, 1);
        Equipo equipo_03 = new Equipo("C.B Cornella", "Cornella del Llobregat", calendar.getTime());
        equipoRepository.save(equipo_03);

        Jugador jugador_03 = jugadorRepository.findByName("Pau Gasol");
        jugador_03.setEquipo(equipo_03);
        jugadorRepository.save(jugador_03);

        calendar.set(1980, Calendar.OCTOBER, 23);
        Equipo equipo_04 = new Equipo("C.B Rose", "Barcelona Capital",calendar.getTime());
        equipoRepository.save(equipo_04);

        Jugador jugador_04 = jugadorRepository.findByName("Marc Gasol");
        jugador_04.setEquipo(equipo_04);
        jugadorRepository.save(jugador_04);

        calendar.set(2000, Calendar.DECEMBER, 10);
        Equipo equipo_05 = new Equipo("C.B Tecla Sala", "L'Hospitalet de Llobregat",calendar.getTime());
        equipoRepository.save(equipo_05);

        Jugador jugador_05 = jugadorRepository.findByName("Kobe Bryant");
        jugador_05.setEquipo(equipo_05);
        jugadorRepository.save(jugador_05);

        //Equipos en una localidad concreta
        System.out.println(equipoRepository.findByNameLike("Sitges"));

        //Jugadores de un equipo a partir del equipo
        System.out.println(jugadorRepository.findByNombreEquipo(equipo_01.getName()));

        //Jugadores de un equipo a partir del equipo y la posicion
        System.out.println(jugadorRepository.findByNombreEquipoAndPosition(equipo_01.getName(), jugador_01.getPosicion()));

        //Maximo anotador a partir de un equipo
        System.out.println(jugadorRepository.findByMaximoAnotadorEquipo("C.B Sitges"));


    }
}
