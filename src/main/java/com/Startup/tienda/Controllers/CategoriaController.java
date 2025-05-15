package com.Startup.tienda.Controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Startup.tienda.Entities.Categorias;
import com.Startup.tienda.Services.CategoriaService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.Startup.tienda.DTOS.CategoriaDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;



@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    
    @Autowired
    CategoriaService servicio;

    @GetMapping("/enlistar")
    public List<CategoriaDTO> enlistarCategorias() {

        return servicio.encontrarTodasLasCategorias();

    }
    
    @PostMapping("/guardar")
    public RespuestaDTO guardarCategorias(@RequestBody CategoriaDTO categoria) {
        
        return servicio.guardarCategoria(categoria);
    }
    

}
