package com.Services.ServicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Entities.Categorias;
import com.Repositories.Repositories.CategoriasRepository;
import com.Services.Services.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    private final CategoriasRepository repository;

    public CategoriaServiceImpl (CategoriasRepository repository){

        this.repository = repository;

    }

    @Override
    public List<Categorias> encontrarTodasLasCategorias(){

        List<Categorias> categoriasEncontradas = repository.findAll() ;
        
        return categoriasEncontradas;

    }

}
