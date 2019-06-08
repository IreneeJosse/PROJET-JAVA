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
public class Classe{
    // Variables
    String id;
    String nom;
    String anneeScolaireId;
    String niveauId;
    String ecoleId;

    // Getter
    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getAnneeScolaireId(){
        return anneeScolaireId;
    }
    public String getNiveauId(){
        return niveauId;
    }
    public String getEcoleId(){
        return ecoleId;
    }

    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setNom(String s){
        this.nom = s;
    }
    public void setAnneeSColaireId(String s){
        this.anneeScolaireId = s;
    }
    public void setNiveauId(String s){
        this.niveauId = s;
    }
    public void setEcoleId(String s){
        this.ecoleId = s;
    }
    
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.nom = A.get(1);
        this.anneeScolaireId = A.get(2);
        this.niveauId = A.get(3);
        this.ecoleId = A.get(4);
    }
}
