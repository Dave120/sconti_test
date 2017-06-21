/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.proyecto.sconti.dto;

import java.util.Date;

/**
 *
 * @author rafael
 */
public class Ventas {
    
    private int idVenta;
    private Date fechaVenta;
    private int cantidad;
    private int idProducto;

    public Ventas() {
    }

    public Ventas(Date fechaVenta, int cantidad) {
        this.fechaVenta = fechaVenta;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

  
    
    
}
