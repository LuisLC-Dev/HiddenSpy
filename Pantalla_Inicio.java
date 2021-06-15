import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la pantalla de inicio, osea lo primero que se ve cuando se inicia el juego
 * 
 * @author (Hector Gustavo Hernandez Reyes)
 * @version (13/06/2021)
 */
public class Pantalla_Inicio extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Pantalla_Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(960, 540, 1);
        addElements();
    }
    
    void addElements(){
        addObject(ButtonJugar.getInstance(),480,300);
        addObject(ButtonAyuda.getInstance(),480,380);
        addObject(ButtonRecords.getInstance(),480,460);
    }
}