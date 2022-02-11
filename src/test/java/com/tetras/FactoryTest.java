package com.tetras;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

//import java.util.concurrent.Executor;

import org.junit.jupiter.api.Test;


public class PacmanTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams(){
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams(){
        System.setOut(originalOut);
    }

    class PacmanInstanciator implements Runnable {
        @Override
        public void run(){
            System.out.println(Pacman.getinstance());
        }
    }

    @Test
    void testSingleton() throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(new PacmanInstanciator());
        executor.submit(new PacmanInstanciator());

        executor.awaitTermination(2, TimeUnit.SECONDS);

        while (outContent.size() == 0){
            Thread.sleep(2);
        }

        String[] outputList = outContent.toString().split("\\n");
        assertEquals(2, outputList.length);
        assertEquals(outputList[0], outputList[1]);
    }

}


public class FactoryTest {
    

    //test pacman singleton 
    // @Test
    // void testSingletonPacman(){
    //     Pacman monPacman1 = Pacman.getinstance();
    //     Pacman monPacman2 = Pacman.getinstance();

    //     assertEquals(monPacman1, monPacman2);
    // }

    @Test
    public void TestPac(){
        //1
        IPacGomme executor = PacGommeFactory.getPacGomme();
        assertTrue(executor instanceof PacGommeNormale);
        //2
        IPacGomme executor2 = PacGommeFactory.getPacGomme();
        assertTrue(executor2 instanceof PacGommeNormale);
        //3
        IPacGomme executor3 = PacGommeFactory.getPacGomme();
        assertTrue(executor3 instanceof PacGommeNormale);
        //4
        IPacGomme executor4 = PacGommeFactory.getPacGomme();
        assertTrue(executor4 instanceof PacGommeNormale);
        //5
        IPacGomme executor5 = PacGommeFactory.getPacGomme();
        assertTrue(executor5 instanceof PacGommeNormale);
        //6
        IPacGomme executor6 = PacGommeFactory.getPacGomme();
        assertTrue(executor6 instanceof PacGommeNormale);
        //7
        IPacGomme executor7 = PacGommeFactory.getPacGomme();
        assertTrue(executor7 instanceof PacGommeNormale);
        //8
        IPacGomme executor8 = PacGommeFactory.getPacGomme();
        assertTrue(executor8 instanceof PacGommeNormale);
        //9
        IPacGomme executor9 = PacGommeFactory.getPacGomme();
        assertTrue(executor9 instanceof PacGommeNormale);
        //10
        IPacGomme executor10 = PacGommeFactory.getPacGomme();
        assertTrue(executor10 instanceof PacGommeNormale);
        //11
        IPacGomme executor11 = PacGommeFactory.getPacGomme();
        assertTrue(executor11 instanceof PacGommeNormale);
        //12
        IPacGomme executor12 = PacGommeFactory.getPacGomme();
        assertTrue(executor12 instanceof PacGommeNormale);
        //13
        IPacGomme executor13 = PacGommeFactory.getPacGomme();
        assertTrue(executor13 instanceof PacGommeNormale);
        //14
        IPacGomme executor14 = PacGommeFactory.getPacGomme();
        assertTrue(executor14 instanceof PacGommeNormale);
        //15
        IPacGomme executor15 = PacGommeFactory.getPacGomme();
        assertTrue(executor15 instanceof PacGommeNormale);

        //16
        IPacGomme executor16 = PacGommeFactory.getPacGomme();
        assertTrue(executor16 instanceof PacGommeBoost);

        //17
        IPacGomme executor17 = PacGommeFactory.getPacGomme();
        assertTrue(executor17 instanceof PacGommeNormale);

        //tester taille pacGomme
        assertTrue(executor16.GetTaille() == 10);
        assertTrue(executor17.GetTaille() == 5);
      

        //tester couleur PacGomme
        assertTrue(executor16.GetCouleur() == "Bleue");
        assertTrue(executor17.GetCouleur() == "Jaune");

    }
}