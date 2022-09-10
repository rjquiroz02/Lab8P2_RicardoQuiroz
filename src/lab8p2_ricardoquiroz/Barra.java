/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_ricardoquiroz;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author rjqer
 */
public class Barra extends Thread{
    private JProgressBar barra;
    private ArrayList<SerVivo> lista = new ArrayList();

    public Barra() {
    }

    public Barra(JProgressBar barra, ArrayList lista) {
        this.barra = barra;
        this.lista = lista;
    }
    
    
    
    public void run(){
        for (Object object : lista) {
            barra.setValue(barra.getValue() + 1);
            barra.setString(Integer.toString(barra.getValue()) + "Cargados");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
}
