package com.example.Controller;

import com.example.Model.Equipo;
import com.example.Repository.EquipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jhipster on 25/11/15.
 */
public class EquipoController {

    @Autowired
    private EquipoRepository equipoRepository;


    @RequestMapping(method = RequestMethod.POST) //metodo para crear un jugador y verlo en html
    @ResponseStatus(HttpStatus.CREATED) //??
    public Equipo save(@RequestBody Equipo equipo) { //??
        return equipoRepository.save(equipo); //??
    }

    @RequestMapping(method = RequestMethod.GET) //??
    public List<Equipo> findAll() {
        List<Equipo> equipo = new ArrayList<Equipo>(); //??
        Iterator<Equipo> iterator = equipoRepository.findAll().iterator(); //??

        while (iterator.hasNext()) { //??
            equipo.add(iterator.next());//??
        }

        return equipo;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        Equipo equipo = equipoRepository.findOne(id);
/*
        if (equipo == null) {
            throw new EquipoException(id);
        }
*/
        equipoRepository.delete(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Equipo updateById(@PathVariable Long id, @RequestBody Equipo equipo) {
        Equipo d1 = equipoRepository.findOne(id);
/*
        if (d1 == null) {
            throw new EquipoException(id);
        }
*/
        return equipoRepository.save(equipo);
    }
}
