package com.Startup.tienda.Services;

import java.util.List;

import com.Startup.tienda.DTOS.CategoriaDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;

public interface CategoriaService  {
    
    public List<CategoriaDTO> encontrarTodasLasCategorias();
    public RespuestaDTO guardarCategoria(CategoriaDTO categoria);
    public RespuestaDTO encontrarCategoriaPorId(int id);
    public RespuestaDTO prohibirCategoriaPorId(int id);
    public RespuestaDTO revivirCategoriaPorId(int id);

}
