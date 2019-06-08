/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

import java.util.ArrayList;

/**
 *
 * @author Salim LOUHMADI, Theo BEAUJOIS, Irenee JOSSE
 */
public class Niveau {
    // Variables
    String id;
    String nom;
    
    // Getter
    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    
    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setNom(String s){
        this.nom = s;
    }
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.nom = A.get(1);
    }
}
