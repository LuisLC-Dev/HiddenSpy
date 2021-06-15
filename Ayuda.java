import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayuda extends World
{
    public Ayuda(World world)
    {    
        super(600, 400, 1);
        addObject(new ButtonRegresar(world),500,350);
    }
}
