/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.proyecto.sconti.Dao;

import com.mx.proyecto.sconti.dto.Producto;
import java.util.List;

/**
 *
 * @author rafael
 */
public interface ProductoDao {
    
    public void insertProducto(Producto producto);
    public void deleteProducto(Producto producto);
    public void updateProducto(Producto producto);
    public List<Producto> getAllProductos();
    public Producto getProductoById(Producto producto);
}
