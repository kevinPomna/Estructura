/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura.Pilas;

import java.util.Date;

/**
 *
 * @author kepomacu
 */
public class PaginaWeb {
 
    public String nombre;
    public String rutas;
    public Date horaVista;
    public byte[] icono;
    public Date foraCierre; 
    public String dispositivo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutas() {
        return rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public Date getHoraVista() {
        return horaVista;
    }

    public void setHoraVista(Date horaVista) {
        this.horaVista = horaVista;
    }

    public byte[] getIcono() {
        return icono;
    }

    public void setIcono(byte[] icono) {
        this.icono = icono;
    }

    public Date getForaCierre() {
        return foraCierre;
    }

    public void setForaCierre(Date foraCierre) {
        this.foraCierre = foraCierre;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public PaginaWeb() {
    }

    public PaginaWeb(String nombre, String rutas, Date horaVista, byte[] icono, Date foraCierre, String dispositivo) {
        this.nombre = nombre;
        this.rutas = rutas;
        this.horaVista = horaVista;
        this.icono = icono;
        this.foraCierre = foraCierre;
        this.dispositivo = dispositivo;
    }

    @Override
    public String toString() {
        return "PaginaWeb{" + "nombre=" + nombre + ", rutas=" + rutas + ", horaVista=" + horaVista + ", icono=" + icono + ", foraCierre=" + foraCierre + ", dispositivo=" + dispositivo + '}';
    }

    void setforaCierre(Date date) {

    }

  
    
    
    
    
    
    
}
