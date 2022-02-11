package com.tetras;

import java.util.ArrayList;
import java.util.List;

public class Labyrinthe{
    public Pacman UnPacman;
    public List<PacGommeBoost> UneListePacGommeB = new ArrayList<PacGommeBoost>();
    public List<PacGommeNormale> UneListePacGommeN = new ArrayList<PacGommeNormale>();

    public Labyrinthe(Pacman Pacman, List<PacGommeBoost> UneListePacGommeBoost, List<PacGommeNormale> uneListePacGommeNormal){
        this.UnPacman = Pacman;
        this.UneListePacGommeB = UneListePacGommeBoost;
        this.UneListePacGommeN = uneListePacGommeNormal;
    }
}

