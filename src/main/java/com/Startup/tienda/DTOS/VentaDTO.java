package com.Startup.tienda.DTOS;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.Startup.tienda.Entities.Productos;

public class VentaDTO {
    
    private int id;
    private double totalVenta;
    private Date fechaVenta;
    private List<Productos> productos = new ArrayList<>();
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getTotalVenta() {
        return totalVenta;
    }
    public void setTotalVenta(double totalVenta) {
        this.totalVenta = totalVenta;
    }
    public Date getFechaVenta() {
        return fechaVenta;
    }
    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    public List<Productos> getProductos() {
        return productos;
    }
    public void setProductos(List<Productos> productos) {
        this.productos = productos;
    }
    

    

}
