package com.Startup.tienda.Services;

import java.util.List;

import com.Startup.tienda.DTOS.CategoriaDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;
import com.Startup.tienda.Entities.Categorias;

public interface CategoriaService  {
    
    public List<CategoriaDTO> encontrarTodasLasCategorias();
    public RespuestaDTO guardarCategoria(CategoriaDTO categoria);

}
