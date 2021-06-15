import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Dibujo
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public VisionRange vr;
    
    private int caminadireccion;
    
    public void act() 
    {
        
    }
    
    VisionRange initVr(){
    vr = new VisionRange();
    return vr;
    }
    
    public void addVisionRange(){
    getWorld().addObject(vr, getX(), getY());
    }
    
    public Enemy(){
    vr = initVr();
    }
}
