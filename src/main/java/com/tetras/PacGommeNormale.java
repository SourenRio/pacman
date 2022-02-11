package com.tetras;

public class PacGommeNormale implements IPacGomme {
    
    public int Taille = 5;
    public String Couleur = "Jaune";

    public PacGommeNormale(){
        this.Taille = 5;
        this.Couleur = "Jaune";
    }

    public String GetCouleur()
    {
        return this.Couleur;
    }

    public Integer GetTaille()
    {
        return this.Taille;
    }
}
