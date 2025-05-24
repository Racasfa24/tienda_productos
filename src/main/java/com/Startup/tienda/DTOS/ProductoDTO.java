package com.Startup.tienda.DTOS;

public class ProductoDTO {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private Long stock;
    private byte[] imagen_producto;
    private boolean descatalogado;
    
    

    private int categoria_fk;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public byte[] getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(byte[] imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public int getCategoria_fk() {
        return categoria_fk;
    }

    public void setCategoria_fk(int categoria_fk) {
        this.categoria_fk = categoria_fk;
    }

    public boolean isDescatalogado() {
        return descatalogado;
    }

    public void setDescatalogado(boolean descatalogado) {
        this.descatalogado = descatalogado;
    }

    

}
