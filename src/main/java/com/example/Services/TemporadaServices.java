package com.example.Services;


import com.example.Model.Temporada;
import com.example.Repository.EquipoRepository;
import com.example.Repository.LigaRepository;
import com.example.Repository.TemporadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by jhipster on 22/10/15.
 */

@Service
@Transactional
public class TemporadaServices {

    @Autowired
    private TemporadaRepository temporadaRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private LigaRepository ligaRepository;

    public void testTemporada() {

        //creo la temporada
        Temporada temporada_01 = new Temporada(2005);
        //añado a la temporada una liga que se llame ACB
        temporada_01.setLiga(ligaRepository.findByNombre("ACB"));
        //año a la temporada el primer equipo (1 posicion L tipo dato (Long)) // se usa add para las tablas NM
        temporada_01.getEquipos().add(equipoRepository.findOne(1L));
        //guardo la temporada creada
        temporadaRepository.save(temporada_01);
        //una vez creada la temporada, busco una liga para añadir la temporada a esa liga buscada

        Temporada temporada_02 = new Temporada(2015);
        temporada_02.setLiga(ligaRepository.findByNombre("ACB"));
        temporada_02.getEquipos().add(equipoRepository.findOne(2L));
        temporadaRepository.save(temporada_02);

    }
}