/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modele;

/**
 *
 * @author Théo
 */

//Cette classe contient deux fonctions qui renvoient sous formes de String des requêtes SQL à utiliser sur la base de données.
public class SQLRequests {
    
    //Cette methode prend en argument trois String: le TypeRecherche (Nom, Prenom ou Classe), l'ObjetRecherche (Eleve, Enseignant ou) et la Recherche qui est le String tapé dans la barre de recherche par l'utilisateur.
    public String SQL_Rechercher(String TypeRecherche, String ObjetRecherche, String Recherche)
    {
        String SQL= new String();
        SQL="SELECT * FROM " + ObjetRecherche + "WHERE " + TypeRecherche + "LIKE %" + Recherche +"%";
        return SQL;
    }
    
    //Cette methode prend en argument quatres String: le TypeRecherche (Nom, Prenom ou Classe), l'ObjetRecherche (Eleve, Enseignant ou), la Recherche qui est le String tapé dans la barre de recherche par l'utilisateur
    //Nouveau qui est la valeur par laquelle on veut modifier le AModifier.
    public String SQL_Modifier(String TypeRecherche, String ObjetRecherche, String Recherche, String AModifier, String Nouveau)
    {
        String SQL= new String();
        SQL="UPDATE " + ObjetRecherche + "SET " + AModifier + "= " + Nouveau + "WHERE " + TypeRecherche + "LIKE %" + Recherche + "%";
        return SQL;
    }
}
