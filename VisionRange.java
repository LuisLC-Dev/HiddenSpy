import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VisionRange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VisionRange extends Actor
{
    /**
     * Act - do whatever the VisionRange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int posx;
    int posy;
    
    public VisionRange()
    {
        setImage("images/VisionRange.png");
        
    }
    
    void setX(int x){
    this.posx = x;
    }
    void setY(int y){
    this.posy = y;
    }
    public void act() 
    {
        setLocation(posx,posy);
    }    
}
