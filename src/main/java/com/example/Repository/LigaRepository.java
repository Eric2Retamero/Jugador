package com.example.Repository;

import com.example.Model.Liga;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by jhipster on 29/10/15.
 */
public interface LigaRepository extends PagingAndSortingRepository<Liga, Long>{

    public Liga findByNombre(String nombre);
}
