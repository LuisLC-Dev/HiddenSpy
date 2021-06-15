import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * Write a description of class Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Records extends World
{

    /**
     * Constructor for objects of class Records.
     * 
     */
    public Records()
    {    
       super(960, 540, 1);
       //System.out.println("Hola");
        try{
       File Score = new File("Scores.txt");
       Scanner sc = new Scanner(Score);
       Scanner sc2 = new Scanner(Score);
       for(int j = 0; j < 5; j++){
                    String nombre = sc.next();
                    String Puntuacion = sc.next();
                    //System.out.println("Hola");
                    //System.out.println(nombre + " " + Puntuacion);
                    showText(nombre + " " + Puntuacion,480, 200 + 40*j);
    }
}catch (FileNotFoundException e){Greenfoot.stop();}

}
}
