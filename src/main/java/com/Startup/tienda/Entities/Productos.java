package com.Startup.tienda.Entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Productos {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String nombre;
    private String descripcion;
    private double precio;
    private Long stock;

    //--Un producto solo tiene una categoría.
    @ManyToOne
    @JoinColumn(name="categoria_fk")
    @JsonBackReference
    private Categorias categoria_fk;

    @Lob
    private byte[] imagen_producto;

    //--Un producto puede permenecer a varias ventas.
    @ManyToMany(mappedBy = "productos")
    private List<Ventas> ventas = new ArrayList<>();

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

    public Categorias getCategoria_fk() {
        return categoria_fk;
    }

    public void setCategoria_fk(Categorias categoria_fk) {
        this.categoria_fk = categoria_fk;
    }

    public byte[] getImagen_producto() {
        return imagen_producto;
    }

    public void setImagen_producto(byte[] imagen_producto) {
        this.imagen_producto = imagen_producto;
    }

    public List<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(List<Ventas> ventas) {
        this.ventas = ventas;
    }

    
    
}
