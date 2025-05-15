package com.Startup.tienda.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Startup.tienda.DTOS.CategoriaDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;
import com.Startup.tienda.Entities.Categorias;
import com.Startup.tienda.Repositories.CategoriasRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriasRepository repository;

    @Override
    public List<CategoriaDTO> encontrarTodasLasCategorias(){

        List<CategoriaDTO> categoriasEncontradas = repository.findAll().stream().map(categoria -> new CategoriaDTO(
                categoria.getId(),
                categoria.getNombre()
            )).collect(Collectors.toList());
        
        return categoriasEncontradas;

    }

    @Override
    public RespuestaDTO guardarCategoria(CategoriaDTO categoria){

        Categorias nuevaCategoria = new Categorias();
        nuevaCategoria.setNombre(categoria.getNombre());
        repository.save(nuevaCategoria);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Excelente, entidad guardada");
        respuesta.setEntidad(categoria);

        return respuesta;

    }

}
