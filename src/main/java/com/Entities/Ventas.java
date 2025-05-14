package com.Entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class Ventas {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double totalVenta;
    private Date fechaVenta;

    //--Una venta puede tener varios productos.
    @ManyToMany
    @JoinTable(
        name = "productos_ventas",
        joinColumns = @JoinColumn(name = "venta_id"),
        inverseJoinColumns = @JoinColumn(name = "producto_id")
    )
    private List<Productos> productos = new ArrayList<>();

    public Long getId() {
        return id;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    public List<Productos> getProductos() {
        return productos;
    }
    public double getTotalVenta() {
        return totalVenta;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
    
}
