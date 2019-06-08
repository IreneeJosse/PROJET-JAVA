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
public class DetailsBulletin {
    // Variables
    String id;
    String bulletinId;
    String enseignantId;
    String appreciation;
    
    // Getter
    public String getId(){
        return id;
    }
    public String getBulletinId(){
        return bulletinId;
    }
    public String getEnseignantId(){
        return enseignantId;
    }
    public String getAppreciation(){
        return appreciation;
    }
    
    // Setter
    public void setID(String s){
        this.id = s;
    }
    public void setBulletinId(String s){
        this.bulletinId = s;
    }
    public void setEnseignantId(String s){
        this.enseignantId = s;
    }
    public void setAppreciation(String s){
        this.appreciation = s;
    }
}
