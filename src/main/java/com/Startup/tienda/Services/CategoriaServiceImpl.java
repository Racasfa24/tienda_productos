package com.Startup.tienda.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Startup.tienda.Entities.Categorias;
import com.Startup.tienda.Repositories.CategoriasRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriasRepository repository;

    @Override
    public List<Categorias> encontrarTodasLasCategorias(){

        List<Categorias> categoriasEncontradas = repository.findAll() ;
        
        return categoriasEncontradas;

    }

}
