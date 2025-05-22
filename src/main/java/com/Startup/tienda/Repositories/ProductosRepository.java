package com.Startup.tienda.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Startup.tienda.Entities.Productos;

public interface ProductosRepository extends JpaRepository<Productos, Integer> {}
