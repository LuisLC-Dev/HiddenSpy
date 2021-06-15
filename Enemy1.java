import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Enemy1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Enemy
{
    /**
     * Act - do whatever the Enemy1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    private int currentImage;
    private int counter;
    private int ifi = 1;
    private int dir;
    public VisionRange vr;
    
    
    public Enemy1(VisionRange vr){
        this.vr = vr;
    setImage("images/Enemy1Front.png");
            
           
            dir = Greenfoot.getRandomNumber(3);
            ArrayList<GreenfootImage> pSprites= new ArrayList<>();
            ArrayList<Integer> pIntegers= new ArrayList<>();

            ArrayList<GreenfootImage> p1Sprites= new ArrayList<>();
            ArrayList<Integer> p1Integers= new ArrayList<>();
            
            ArrayList<GreenfootImage> p2Sprites= new ArrayList<>();
            ArrayList<Integer> p2Integers= new ArrayList<>();
            
            ArrayList<GreenfootImage> p3Sprites= new ArrayList<>();
            ArrayList<Integer> p3Integers= new ArrayList<>();
            
            for(int i=0; i < 3; i++)
            {
                 pIntegers.add(new Integer(5));
                 p1Integers.add(new Integer(5));
            }
            pSprites.add(new GreenfootImage("images/Enemy1Front.png"));
            pSprites.add(new GreenfootImage("images/Enemy1WalkingFront1.png"));
            pSprites.add(new GreenfootImage("images/Enemy1WalkingFront2.png"));
           
            p1Sprites.add(new GreenfootImage("images/Enemy1Left.png"));
            p1Sprites.add(new GreenfootImage("images/Enemy1WalkingLeft.png"));
            
            p2Sprites.add(new GreenfootImage("images/Enemy1Right.png"));
            p2Sprites.add(new GreenfootImage("images/Enemy1WalkingRight.png"));
            
            p3Sprites.add(new GreenfootImage("images/Enemy1TurnedArround.png"));
            p3Sprites.add(new GreenfootImage("images/Enemy1WalkingTurnedArround1.png"));
            p3Sprites.add(new GreenfootImage("images/Enemy1WalkingTurnedArround2.png"));
            
            //incluir las otras dos animaicones

            animacion.addAnimacion(pSprites, pIntegers);
            animacion.addAnimacion(p1Sprites, p1Integers);
            animacion.addAnimacion(p2Sprites, pIntegers);
            animacion.addAnimacion(p3Sprites, p1Integers);
            initDireccion(1);
            setDireccion(1);
            setImage(animacion.getImagen());
            
            
    }
    
    public void act() 
    {
        if(dir == 0){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(0);
        }
        }else
        if(dir == 1){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(1);
        }
    }else
        if(dir == 2){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(2);
    }
        }else
        if(dir == 3){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(3);
        }
    }else{
        animacion.setColumna(0);
        animacion.setFrameActual(0);
        ifi = 1;
    }
        nextSprite();
        EnemyDirection(vr);
    }
    public void EnemyDirection(VisionRange vr)
    {
        int x = getX();
        int y = getY();
        int OFFSET = 2;

        if(dir == 2)
        {
           Actor collide=getOneObjectAtOffset(20,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
                dir = 5;
                dir = Greenfoot.getRandomNumber(4);
            }
            setLocation(x + OFFSET, y);
            vr.setLocation(x + OFFSET, y);
           
        }
        else if(dir == 1)
        {
           Actor collide=getOneObjectAtOffset(-20,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
                dir = 5;
                dir = Greenfoot.getRandomNumber(4);
            }
            setLocation(x - OFFSET, y);
            vr.setLocation(x - OFFSET, y);
        }
        else if(dir == 3)
        {
            Actor collide=getOneObjectAtOffset(0,-20,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
                dir = 5;
                dir = Greenfoot.getRandomNumber(4);
            }
            setLocation(x, y - OFFSET);
            vr.setLocation(x, y - OFFSET);
        }
        else if(dir == 0)
        {
            Actor collide=getOneObjectAtOffset(0,20,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
                dir = 5;
                dir = Greenfoot.getRandomNumber(4);
                
            }
            
            setLocation(x, y + OFFSET);
            vr.setLocation(x, y + OFFSET);
        }
        animacion.setFila(dir);
    }
}
