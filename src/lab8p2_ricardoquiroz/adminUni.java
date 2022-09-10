/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8p2_ricardoquiroz;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author rjqer
 */
public class adminUni {
    private ArrayList<Universo> universos = new ArrayList();
    private File archivo = null;
    
    public adminUni(String path){
        archivo = new File(path);
    }
    
    
    
    
}
