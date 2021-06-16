import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonVolverAJugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonVolverAJugar extends Button
{
    public ButtonVolverAJugar(){
        setImage("images/volverAJugar.png");
    }
    
    public void buttonAction(){
        Pantalla_Inicio nuevo = new Pantalla_Inicio();
        Greenfoot.setWorld(nuevo);
    }
}
