package com.Startup.tienda.DTOS;

public class ProductoDTO {
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Long stock;
    private byte[] imagen_producto;

    private int categoria_fk;
}
