package com.Repositories.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entities.Categorias;

//--Extiende de CrudRepository para poder tener las funciones básicas de un crud
@Repository
public interface CategoriasRepository extends CrudRepository<Categorias, Long> {
    
    @Override
    public List<Categorias> findAll();

}
