/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_ricardoquiroz;

import java.io.Serializable;

/**
 *
 * @author rjqer
 */
public class SerVivo implements Serializable{
    private String nombre, id, univesoproc, raza;
    private int poder, anios;
    
    private static final long SerialVersionUID=200L;

    public SerVivo() {
    }

    public SerVivo(String nombre, String id, String univesoproc, String raza, int poder, int anios) {
        this.nombre = nombre;
        this.id = id;
        this.univesoproc = univesoproc;
        this.raza = raza;
        this.poder = poder;
        this.anios = anios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnivesoproc() {
        return univesoproc;
    }

    public void setUnivesoproc(String univesoproc) {
        this.univesoproc = univesoproc;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public String toString() {
        return "SerVivo{" + "nombre=" + nombre + ", id=" + id + ", univesoproc=" + univesoproc + ", raza=" + raza + ", poder=" + poder + ", anios=" + anios + '}';
    }
    
    
    
    
}
