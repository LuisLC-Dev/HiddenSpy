import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ninja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ninja extends Dibujo
{
    /**
     * Act - do whatever the Ninja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int currentImage;
    private int counter;
    public void act() 
    {   
    setImage("images/NinjaFront.png");
    }    
    
    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 5;

        if(Greenfoot.isKeyDown("right"))
        {
            Actor collide=getOneObjectAtOffset(38,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x + OFFSET, y);
            //setRotation(0);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            Actor collide=getOneObjectAtOffset(-38,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x - OFFSET, y);
            //setRotation(-180);
        }
        else if(Greenfoot.isKeyDown("up"))
        {
            Actor collide=getOneObjectAtOffset(0,-38,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y - OFFSET);
            //setRotation(-90);
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            Actor collide=getOneObjectAtOffset(0,38,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y + OFFSET);
            //setRotation(-270);
        }
    }
    public void moveMouth()
    {
        if(counter==0)
        {
            if(currentImage==0)
            {
                setImage("pacmanbocaCerrada.png");
            }else if(currentImage==1)
            {
                setImage("pacmanbocaAbierta.png");
            }
            currentImage = (currentImage + 1) % 2;
        }
        counter = (counter + 1)%4;
    }
}
