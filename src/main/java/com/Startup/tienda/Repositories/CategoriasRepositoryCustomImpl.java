package com.Startup.tienda.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Startup.tienda.DTOS.RespuestaDTO;

@Repository
public class CategoriasRepositoryCustomImpl implements CategoriasRepositoryCustom {
    
    @Autowired
    JdbcTemplate jdbc = new JdbcTemplate();

    @Override
    public String prohibirCategoria(int id){

        String sql = "CALL cancelar_categoria(?)";
        jdbc.update(sql,id);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Categoría cancelada correctamente");
        return respuesta.getMensaje();

    }

    @Override 
    public String revivirCategoria(int id){

        String sql= "CALL revivir_categoria(?)";
        jdbc.update(sql, id);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Categoría activada correctamente");
        return respuesta.getMensaje();


    }

}
