/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_ricardoquiroz;

import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class Universo {
    private String nombre;
    private ArrayList<SerVivo> listaS = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<SerVivo> getListaS() {
        return listaS;
    }

    public void setListaS(ArrayList<SerVivo> listaS) {
        this.listaS = listaS;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", listaS=" + listaS + '}';
    }
    
    
    
    
}
