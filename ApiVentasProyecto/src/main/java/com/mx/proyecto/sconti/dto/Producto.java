/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.proyecto.sconti.dto;

/**
 *
 * @author rafael
 */
public class Producto {
    
    private int idProducto;
    private String nombre;
    private float precio;
    private int enExistencia;

    public Producto() {
    }

    public Producto(String nombre, float precio, int enExistencia) {
        this.nombre = nombre;
        this.precio = precio;
        this.enExistencia = enExistencia;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getEnExistencia() {
        return enExistencia;
    }

    public void setEnExistencia(int enExistencia) {
        this.enExistencia = enExistencia;
    }
    
    
    
}
