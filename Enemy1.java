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
   
    public Enemy1(){
    setImage("images/Enemy1Front.png");
    
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
        if(Greenfoot.isKeyDown("s")){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(0);
        }
        }else
        if(Greenfoot.isKeyDown("a")){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(1);
        }
    }else
        if(Greenfoot.isKeyDown("d")){
            if(ifi == 1){
                ifi = 0;
        animacion.setFila(2);
    }
        }else
        if(Greenfoot.isKeyDown("w")){
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
    }    
}
