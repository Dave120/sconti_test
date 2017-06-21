/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.proyecto.sconti.Dao;

import com.mx.proyecto.sconti.dto.Ventas;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rafael
 */
public interface VentasDao {
    
    public void insertVenta(Ventas venta);
    public void deleteVenta(Ventas venta);
    public void updateVenta(Ventas venta);
    public List<Ventas> getAllVentas();
    public List<Ventas> getVentaByFecha(Date fecha);
    public List<Ventas> getVentaById(Ventas venta);
}
