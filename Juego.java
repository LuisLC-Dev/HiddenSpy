import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * En este mundo se generan los niveles a partir de un txt.
 * 
 * @author (Hector Gustavo Hernandez Reyes) 
 * @version (14/06/2021)
 */
public class git Juego extends World
{
    public Juego(int numNivel, int ancho, int alto)
    {    
        super(1280,720, 1);
        cargaNivel(numNivel, ancho,alto);
    }
    
    private void cargaNivel(int numNivel, int ancho, int alto){
        try{
            File nivel = new File("Nivel " + numNivel + ".txt");
            Scanner sc = new Scanner(nivel);
            for(int i = 0; i < alto; i++){
                for(int j = 0; j < ancho; j++){
                    int num = sc.nextInt();
                    if(num == 1){
                        addObject(new Wall(),20+40*j,20+40*i);
                    }
                }
            }
        }catch (FileNotFoundException e){Greenfoot.stop();}
    }
}
