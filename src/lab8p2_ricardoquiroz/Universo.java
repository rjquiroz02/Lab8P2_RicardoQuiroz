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
    private int cSeres;
    private ArrayList<SerVivo> listaS = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre, int cSeres) {
        this.nombre = nombre;
        this.cSeres = cSeres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getcSeres() {
        return cSeres;
    }

    public void setcSeres(int cSeres) {
        this.cSeres = cSeres;
    }

    public ArrayList<SerVivo> getListaS() {
        return listaS;
    }

    public void setListaS(ArrayList<SerVivo> listaS) {
        this.listaS = listaS;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", cSeres=" + cSeres + ", listaS=" + listaS + '}';
    }
    
    
    
    
}
