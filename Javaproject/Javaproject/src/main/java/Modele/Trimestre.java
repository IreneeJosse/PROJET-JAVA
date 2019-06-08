/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;
import java.util.Date;

/**
 *
 * @author Salim LOUHMADI, Theo BEAUJOIS, Irenee JOSSE
 */
public class Trimestre {
    // Variables
    String id;
    String anneeId;
    int num;
    Date dateDebut;
    Date dateFin;
    
    // Getter
    public String getId(){
        return id;
    }
    public int getNum(){
        return num;
    }
    public String getAnneeId(){
        return anneeId;
    }
    public Date getDateDebut(){
        return dateDebut;
    }
    public Date getDateFin(){
        return dateFin;
    }
    
    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setNum(int i){
        this.num = i;
    }
    public void setAnneeId(String s){
        this.anneeId = s;
    }
    public void setDateDebut(Date d){
        this.dateDebut = d;
    }
    public void setDateFin(Date d){
        this.dateFin = d;
    }
}
