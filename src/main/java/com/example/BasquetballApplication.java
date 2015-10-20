package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.Services.JugadorServices;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BasquetballApplication {
    private static JugadorServices jugadorServices;

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(BasquetballApplication.class, args);

        jugadorServices = context.getBean(JugadorServices.class);
        jugadorServices.testJugador();
    }
}
