package com.tetras;
//factory
public class PacGommeFactory {
    private static int nbPacGomme = 0;
    public static IPacGomme getPacGomme(){
        nbPacGomme++;

        if((nbPacGomme % 16) == 0)
        {
           return new PacGommeBoost();
        }
        else
            return new PacGommeNormale();
    }
    
}
