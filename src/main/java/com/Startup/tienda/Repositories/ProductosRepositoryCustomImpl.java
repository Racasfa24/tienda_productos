package com.Startup.tienda.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Startup.tienda.DTOS.RespuestaDTO;

@Repository
public class ProductosRepositoryCustomImpl implements ProductosRepositoryCustom {

    @Autowired
    JdbcTemplate jdbc = new JdbcTemplate();

    @Override
    public String descatalogarProductoPorId(int id){

        String sql = "Call descatalogarProducto(?)";
        jdbc.update(sql,id);

        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Producto sacado de línea correctamente.");
        
        return respuesta.getMensaje();

    }

    @Override
    public String catalogarProductoDescatalogado(int id){

        String sql = "Call catalogarProducto(?)";
        jdbc.update(sql, id);
        
        RespuestaDTO respuesta = new RespuestaDTO();
        respuesta.setMensaje("Producto de vuelta en línea.");

        return respuesta.getMensaje();
    }


    
}
