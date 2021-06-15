import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Es la pantalla de inicio, osea lo primero que se ve cuando se inicia el juego
 * 
 * @author (Hector Gustavo Hernandez Reyes)
 * @version (13/06/2021)
 */
public class Pantalla_Inicio extends World
{
    public Pantalla_Inicio()
    {   
        super(960, 540, 1);
        addElements();
    }
    
    void addElements(){
        addObject(ButtonJugar.getInstance(),480,300);
        addObject(new ButtonAyuda(),480,380);
        addObject(new ButtonRecords(),480,460);
    }
}