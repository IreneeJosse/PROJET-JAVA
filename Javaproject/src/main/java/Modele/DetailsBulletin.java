/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

// Imports
import java.sql.SQLException;
import java.util.ArrayList;
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
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.bulletinId = A.get(1);
        this.enseignantId = A.get(2);
        this.appreciation = A.get(3);
    }
    
    // Methodes
    public float moyenne() throws ClassNotFoundException, SQLException { 
        ArrayList<String> n;
        String req;
        req = "SELECT note FROM Evalutaion WHERE detailBulletinId="+this.id;

        Connexion connect;
        connect = new Connexion("nameDataBase", "loginDataBase", "pwdDataBase");
        n=connect.remplirChampsRequete(req);
       
        float m = 0;
        for(int i = 0; i<n.size(); i++){
            m = m + Float.parseFloat(n.get(i))/n.size();
        }
        return m;
    }
}
