package com.example.Services;

import com.example.Model.Liga;
import com.example.Repository.LigaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by jhipster on 29/10/15.
 */
@Service
@Transactional
public class LigaServices {
    @Autowired
    private LigaRepository ligaRepository;

    public void testLiga() {

        Liga liga_01 = new Liga("ACB");
        ligaRepository.save(liga_01);


/*
        System.out.println(equipoRepository.findByNameLike("Sitges"));
        System.out.println(jugadorRepository.findByNumCanastasTotalGreaterThanEqual(20));
        System.out.println(jugadorRepository.findByNumAsistenciasTotalesBetween(20, 100));
        System.out.println(jugadorRepository.findByPosicionIs("Base"));
        System.out.println(jugadorRepository.findByFechaNacimientoLessThan(calendar.getTime()));
        System.out.println(jugadorRepository.findByNumCanastasTotalGreaterThanEqualAndFechaNacimientoLessThan(20, calendar.getTime()));
        System.out.println(jugadorRepository.findByMaximoAnotador());
*/
    }

}
