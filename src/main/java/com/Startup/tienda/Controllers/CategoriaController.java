package com.Startup.tienda.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Startup.tienda.Entities.Categorias;
import com.Startup.tienda.Services.CategoriaService;


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
