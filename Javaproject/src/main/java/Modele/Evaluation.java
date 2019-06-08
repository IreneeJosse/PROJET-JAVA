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
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.detailBulletinId = A.get(1);
        this.note = Float.parseFloat(A.get(2));
        this.appreciation = A.get(3);
    }
}
