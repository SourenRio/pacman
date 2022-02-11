package com.tetras;
//singleton
public class Pacman {
    private static Pacman instance = new Pacman();

    private Pacman (){

    }

    public static Pacman getinstance()
    {
        return instance;
    }
}
    