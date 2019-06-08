/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

// Imports
import java.util.ArrayList;

/**
 *
 * @author Salim LOUHMADI, Theo BEAUJOIS, Irenee JOSSE
 */

public class Inscription {
    // Variables
    String id;
    String classeId;
    String eleveId;

    // Getter
    public String getId(){
        return id;
    }
    public String getClasseId(){
        return classeId;
    }
    public String getEleveId(){
        return eleveId;
    }

    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setClasseId(String s){
        this.classeId = s;
    }
    public void setEleveId(String s){
        this.eleveId = s;
    }
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.classeId = A.get(1);
        this.eleveId = A.get(2);
    }
}
