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
    public Records(World world){
       super(960, 540, 1);
       cargarRecords();
       addObject(new ButtonRegresar(world),860,490);
    }
    
    private void cargarRecords(){
       try{
           File Score = new File("Scores.txt");
           Scanner sc = new Scanner(Score);
           Scanner sc2 = new Scanner(Score);
           for(int j = 0; j < 5; j++){
               String nombre = sc.next();
               String Puntuacion = sc.next();
               showText(nombre + " " + Puntuacion,480, 200 + 40*j);
           }
       }catch (FileNotFoundException e){Greenfoot.stop();}
    }
}
