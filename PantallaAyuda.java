import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PantallaAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PantallaAyuda extends World
{
    World world;
    public PantallaAyuda(World world)
    {    
        super(600, 400, 1);
        this.world = world;
    }
    
    public void act(){
        checkIsMouseIsPressed();
    }
    
    private void checkIsMouseIsPressed(){
        if(Greenfoot.mousePressed(null)){
            Greenfoot.setWorld(world);
        }
    }
}
