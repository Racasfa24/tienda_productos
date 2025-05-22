package com.Startup.tienda.Services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Startup.tienda.DTOS.CategoriaDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;
import com.Startup.tienda.Entities.Categorias;
import com.Startup.tienda.Repositories.CategoriasRepository;
import com.Startup.tienda.Repositories.CategoriasRepositoryCustom;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    //--Repository contiene los métodos de CRUD básicos.
    @Autowired
    private CategoriasRepository repository;

    //--Repository custom tiene métodos personalizados
    @Autowired
    private CategoriasRepositoryCustom repositoryCustom;

    @Override
    public List<CategoriaDTO> encontrarTodasLasCategorias(){

        //--Con esto se mapea todas las Entidades encontradas por el repositorio a un DTO, para no mostrar todo sobre la entidad y prevenir la referenciación infinita (LAZY)
        List<CategoriaDTO> categoriasEncontradas = repository.findAll().stream().map(categoria -> new CategoriaDTO(
                categoria.getId(),
                categoria.getNombre(),
                categoria.getEstatus()
            )).collect(Collectors.toList());
        
        return categoriasEncontradas;

    }

    @Override
    public RespuestaDTO guardarCategoria(CategoriaDTO categoria){

        //--Como se recibe un DTO, se debe crear una entidad para poder guardarla en la base
        Categorias nuevaCategoria = new Categorias();
        nuevaCategoria.setNombre(categoria.getNombre());
        nuevaCategoria.setEstatus(categoria.getEstatus());

        repository.save(nuevaCategoria);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Excelente, entidad guardada");
        respuesta.setEntidad(categoria);

        return respuesta;

    }

    @Override
    public RespuestaDTO encontrarCategoriaPorId(int id){

        //--En este caso no se mapea, solo se crea el dto con la entidad encontrada y hacemos un manejo del caso null.
        Categorias categoriaEntidad = repository.findById(id).orElse(null);
        RespuestaDTO respuesta = new RespuestaDTO();

        if(categoriaEntidad == null){

            respuesta.setMensaje("No se encontró la categoría deseada o no existe");

        }else{

            CategoriaDTO categoriaEncontrada = new CategoriaDTO(categoriaEntidad.getId(), categoriaEntidad.getNombre(), categoriaEntidad.getEstatus());
            respuesta.setEntidad(categoriaEncontrada);
            respuesta.setMensaje("La categoría fue encontrada con éxito");
        }
        

        return respuesta;

    }

    @Override
    public RespuestaDTO prohibirCategoriaPorId(int id){

        Categorias categoriaAfEntidad = repository.findById(id).orElse(null);
        RespuestaDTO respuesta = new RespuestaDTO();

        if(categoriaAfEntidad == null){

            respuesta.setMensaje("La categoría a cancelar no existe o no fue encontrada");

        }else{

            CategoriaDTO categoriaEncontrada = new CategoriaDTO(categoriaAfEntidad.getId(), categoriaAfEntidad.getNombre(), categoriaAfEntidad.getEstatus());

            respuesta.setMensaje(repositoryCustom.prohibirCategoria(id));
            respuesta.setEntidad(categoriaEncontrada);

        }
        
        return respuesta; 

    }

    @Override
    public RespuestaDTO revivirCategoriaPorId(int id){

        Categorias categoriaAfEntidad = repository.findById(id).orElse(null);
        RespuestaDTO respuesta = new RespuestaDTO();

        if(categoriaAfEntidad == null){

            respuesta.setMensaje("La categoría a revivir no existe o no fue encontrada");

        }else{

            CategoriaDTO categoriaEncontrada = new CategoriaDTO(categoriaAfEntidad.getId(), categoriaAfEntidad.getNombre(), categoriaAfEntidad.getEstatus());

            if(categoriaEncontrada.getEstatus().equalsIgnoreCase("C") ){
                
                respuesta.setMensaje(repositoryCustom.revivirCategoria(id));
                respuesta.setEntidad(categoriaEncontrada);

            }else{

                respuesta.setMensaje("Esta categoría ya ha sido reactivada o no fue cancelada en primer lugar");
                respuesta.setEntidad(categoriaEncontrada);
            }

        }
        return respuesta;

    }

    @Override
    public RespuestaDTO cambiarNombeCategoria(int id, String nombreNuevo){

        Categorias categoriaParaModificar = repository.findById(id).orElse(null);
        RespuestaDTO respuesta = new RespuestaDTO();

        if(categoriaParaModificar == null){

            respuesta.setMensaje("La categoría no fue encontrada");

        }else{

            categoriaParaModificar.setNombre(nombreNuevo);
            repository.save(categoriaParaModificar);
            respuesta.setMensaje("Nombre cambiado correctamente");
            respuesta.setEntidad(categoriaParaModificar);

        }
        return respuesta;


    }
}
