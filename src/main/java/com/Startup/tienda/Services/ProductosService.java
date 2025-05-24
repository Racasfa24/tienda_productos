package com.Startup.tienda.Services;

import java.util.List;

import com.Startup.tienda.DTOS.ProductoDTO;
import com.Startup.tienda.DTOS.RespuestaDTO;

public interface ProductosService {
    
    public List<ProductoDTO> encontrarTodosLosProductos();
    public RespuestaDTO guardarProducto(ProductoDTO producto);
    public RespuestaDTO encontrarProductoId(int id);
    public RespuestaDTO descatalogarProducto(int id);

}
