import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;
/**
 * En este mundo se generan los niveles a partir de un txt.
 * 
 * @author (Hector Gustavo Hernandez Reyes) 
 * @version (14/06/2021)
 */
public class Juego extends World
{
    public Juego(int numNivel, int ancho, int alto, World world)
    {    
        super(1300,680, 1);
        cargaNivel(numNivel, ancho,alto);
<<<<<<< HEAD
        addButtons(world);
=======
        addObject(new Enemy1(), 60, 60);
>>>>>>> crearNivelDelJuego
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
    
    void addButtons(World world){
        addObject(new ButtonRegresar(world),1200, 640);
        addObject(new ButtonAyuda(),1200, 580);
        addObject(new ButtonRecords(),1200, 520);
    }
}
