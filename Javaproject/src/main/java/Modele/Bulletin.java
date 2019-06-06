/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author SalimLOUHMADI, Theo BEAUJOIS, Irenee JOSSE
 */

public class Bulletin {
    // Variables
    String id;
    String incriptionId;
    String trimestreId;
    String appreciation;
    
    // Getter
    public String getId(){
        return id;
    }
    public String getInscriptionId(){
        return inscriptionId;
    }
    public String getTrimestreId(){
        return trimestreId;
    }
    public String getAppreciation(){
        return appreciation;
    }
    
    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setInscriptionId(String s){
        this.inscriptionId = s;
    }
    public void setTrismestreId(String s){
        this.trimestreId = s;
    }
    public void setAppreciation(String s){
        this.appreciation = s;
    }
    
}
