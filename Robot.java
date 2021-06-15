import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Robot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robot extends Enemy
{
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int currentImage;
    private int counter;
    private int ifi = 1;
    private int dir;
    public Robot(){
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
            pSprites.add(new GreenfootImage("images/RobotFront.png"));
            pSprites.add(new GreenfootImage("images/RobotWalking1.png"));
            pSprites.add(new GreenfootImage("images/RobotWalking2.png"));
           
            p1Sprites.add(new GreenfootImage("images/RobotLeft.png"));
            p1Sprites.add(new GreenfootImage("images/RobotWalkingLeft.png"));
            
            p2Sprites.add(new GreenfootImage("images/RobotRight.png"));
            p2Sprites.add(new GreenfootImage("images/RobotWalkingRight.png"));
            
            p3Sprites.add(new GreenfootImage("images/RobotTurnedAround.png"));
            p3Sprites.add(new GreenfootImage("images/RobotWalkingTurnedAround1.png"));
            p3Sprites.add(new GreenfootImage("images/RobotWalkingTurnedAround2.png"));
            
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
        EnemyDirection();
    }
    public void EnemyDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 8;

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
            //setRotation(-180);
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
            //setRotation(-90);
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
            //setRotation(-270);
        }
        animacion.setFila(dir);
    } 
}