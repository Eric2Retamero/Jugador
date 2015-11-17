package com.example;

import com.example.Services.EquipoServices;
import com.example.Services.JugadorServices;
import com.example.Services.LigaServices;
import com.example.Services.TemporadaServices;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasquetballApplication {

    private static JugadorServices jugadorServices;
    private static EquipoServices equipoServices;
    private static LigaServices ligaServices;
    private static TemporadaServices temporadaServices;


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BasquetballApplication.class, args);

        jugadorServices = context.getBean(JugadorServices.class);
        jugadorServices.testJugador();

        equipoServices = context.getBean(EquipoServices.class);
        equipoServices.testEquipo();

        ligaServices = context.getBean(LigaServices.class);
        ligaServices.testLiga();

        temporadaServices = context.getBean(TemporadaServices.class);
        temporadaServices.testTemporada();






    }
}
