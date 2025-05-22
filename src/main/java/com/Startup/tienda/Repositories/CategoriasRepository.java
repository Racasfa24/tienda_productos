package com.Startup.tienda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Startup.tienda.Entities.Categorias;

//--Extiende de CrudRepository para poder tener las funciones básicas de un crud
//--No es necesario implementar las funciones crud aqui, SOLO SE IMPLEMENTAN LAS FUNCIONES PERSONALIZADAS.
@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {}
