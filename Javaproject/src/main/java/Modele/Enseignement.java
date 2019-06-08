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
public class Enseignement {
    // Variable
    String id;
    String classeId;
    String disciplineId;
    String enseignantId;

    // Getter
    public String getId(){
        return id;
    }
    public String getClasseId(){
        return classeId;
    }
    public String getDisciplineId(){
        return disciplineId;
    }
    public String getEnseignantId(){
        return enseignantId;
    }

    // Setter
    public void setId(String s){
        this.id = s;
    }
    public void setClasseId(String s){
        this.classeId = s;
    }
    public void setDisciplineId(String s){
        this.disciplineId = s;
    }
    public void setEnseignantId(String s){
        this.enseignantId = s;
    }
    public void setAll(ArrayList<String> A){
        this.id = A.get(0);
        this.classeId = A.get(1);
        this.disciplineId = A.get(2);
        this.enseignantId = A.get(3);
    }
}
