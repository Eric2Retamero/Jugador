package com.example.Controller;

;
import com.example.Model.Jugador;
import com.example.Repository.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jhipster on 25/11/15.
 */

//REST nos permite crear servicios y aplicaciones que pueden ser usadas por cualquier dispositivo o cliente que entienda HTTP

@RestController //SIRVE PARA SABER QUE ES UN CONTROLADOR
@RequestMapping("/jugador")  //URL RELATIVA PARA ACCEDER AL CONTROLADOR
public class JugadorController {

    @Autowired
    private JugadorRepository jugadorRepository;


    @RequestMapping(method = RequestMethod.POST) //metodo para crear un jugador y verlo en html
    @ResponseStatus(HttpStatus.CREATED) //devuelve el codigo
    public Jugador save(@RequestBody Jugador jugador) { //convierte JSON en JAVA

        //throw new RuntimeException("Error de prueba");

        return jugadorRepository.save(jugador); //??
    }

    @RequestMapping(method= RequestMethod.GET) //??
    public List<Jugador> findAll() {
        List<Jugador> jugador = new ArrayList<Jugador>(); //??
        Iterator<Jugador> iterator = jugadorRepository.findAll().iterator(); //??

        while (iterator.hasNext()) { //??
            jugador.add(iterator.next());//??
        }

        return jugador;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)// id es la parte del codigo que ira cambiando
    public void deleteById(@PathVariable Long id) {
        Jugador jugador = jugadorRepository.findOne(id);
/*
        if(jugador == null){throw new JugadorException(id);}
*/
        jugadorRepository.delete(id);

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Jugador updateById(@PathVariable Long id, @RequestBody Jugador jugador) {
        Jugador d1 = jugadorRepository.findOne(id);
/*
        if(d1 == null){throw new JugadorException(id);}
*/
        return jugadorRepository.save(jugador);
    }
}
