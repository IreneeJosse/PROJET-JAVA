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
public class Evaluation {
    // Variables
    String id;
    String detailBulletinId;
    float note;
    String appreciation;
    
    // Getter
    public String getId(){
        return id;
    }
    public String getDetailBulletinId(){
        return detailBulletinId;
    }
    public float getNote(){
        return note;
    }
    public String getAppreciation(){
        return appreciation;
    }
    
    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setDetailBulletinId(String s){
        this.detailBulletinId = s;
    }
    public void setNote(float f){
        this.note = f;
    }
    public void setAppreciation(String s){
        this.appreciation = s;
    }
}
