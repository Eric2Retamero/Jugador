package com.example.Repository;

import com.example.Model.Temporada;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jhipster on 22/10/15.
 */
public interface TemporadaRepository extends PagingAndSortingRepository<Temporada, Long> {

    public Temporada findByAño(String nombre);

}
