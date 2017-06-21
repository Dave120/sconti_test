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
public class Usuarios {
    
    private int usuarioId;
    private String nombreUsuario;
    private String pasword;

    public Usuarios() {
    }

    public Usuarios(String nombreUsuario, String pasword) {
        this.nombreUsuario = nombreUsuario;
        this.pasword = pasword;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }
    
    
}
