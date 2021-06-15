import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ButtonRegresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRegresar extends Button
{
    private World world;
    
    public ButtonRegresar(World world){
        setImage("button_regresar.png");
        this.world = world;
    }
    
    void buttonAction(){
        Greenfoot.setWorld(world);
    } 
}
