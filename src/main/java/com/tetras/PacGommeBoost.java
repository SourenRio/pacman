package com.tetras;

public class PacGommeBoost implements IPacGomme {
    public int taille = 10;
    public String Couleur = "Bleue";

    public PacGommeBoost(){
    }

    public String GetCouleur()
    {
        return Couleur;
    }

    public Integer GetTaille()
    {
        return taille;
    }




}
