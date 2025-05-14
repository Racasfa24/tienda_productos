package com.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entities.Categorias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Services.Services.CategoriaService;


@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    
    @Autowired
    CategoriaService servicio;

    @GetMapping("/enlistar")
    public List<Categorias> enlistarCategorias() {
        return servicio.encontrarTodasLasCategorias();
    }
    

}
