/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

/**
 *
 * @author Salim LOUHMADI, Theo BEAUJOIS, Irenee JOSSE
 */
public class Eleve {
    // Variables
    String id;
    String nom;
    String prenom;
    
    // Guetter
    public String getId(){
        return id;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    
    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setNom(String s){
        this.nom = s;
    }
    public void setPrenom (String s){
        this.prenom = s;
    }
}
