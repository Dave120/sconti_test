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
public class RolesUsuario {
    
    private int rolUsuarioId;
    private String authority;
    private int usuarioId;

    public RolesUsuario() {
    }

    public RolesUsuario(String authority, int usuarioId) {
        this.authority = authority;
        this.usuarioId = usuarioId;
    }

    public int getRolUsuarioId() {
        return rolUsuarioId;
    }

    public void setRolUsuarioId(int rolUsuarioId) {
        this.rolUsuarioId = rolUsuarioId;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }
    
    
}
