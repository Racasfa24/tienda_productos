package com.Startup.tienda.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Startup.tienda.Entities.Categorias;

//--Extiende de CrudRepository para poder tener las funciones básicas de un crud
@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
    
    //--Personalizamos el método ya que en CrudRepository es una lista Iterable no una List
    @Override
    public List<Categorias> findAll();

}
