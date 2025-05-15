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

        //--Con esto se mapea todas las Entidades encontradas por el repositorio a un DTO, para no mostrar todo sobre la entidad y prevenir la referenciación infinita (LAZY)
        List<CategoriaDTO> categoriasEncontradas = repository.findAll().stream().map(categoria -> new CategoriaDTO(
                categoria.getId(),
                categoria.getNombre()
            )).collect(Collectors.toList());
        
        return categoriasEncontradas;

    }

    @Override
    public RespuestaDTO guardarCategoria(CategoriaDTO categoria){

        //--Como se recibe un DTO, se debe crear una entidad para poder guardarla en la base
        Categorias nuevaCategoria = new Categorias();
        nuevaCategoria.setNombre(categoria.getNombre());
        repository.save(nuevaCategoria);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Excelente, entidad guardada");
        respuesta.setEntidad(categoria);

        return respuesta;

    }

}
