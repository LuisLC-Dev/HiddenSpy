import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

public class Ninja extends Dibujo
{
    private int currentImage;
    private int counter;
    private int ifi = 1;
    private InformacionNinja info;
    
    public Ninja(InformacionNinja info){
            this.info = info;
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
            pSprites.add(new GreenfootImage("images/NinjaFront.png"));
            pSprites.add(new GreenfootImage("images/NinjaWalkingFront1.png"));
            pSprites.add(new GreenfootImage("images/NinjaWalkingFront2.png"));
           
            p1Sprites.add(new GreenfootImage("images/NinjaLeft.png"));
            p1Sprites.add(new GreenfootImage("images/NinjaWalkingLeft.png"));
            
            p2Sprites.add(new GreenfootImage("images/NinjaRight.png"));
            p2Sprites.add(new GreenfootImage("images/NinjaWalkingRight.png"));
            
            p3Sprites.add(new GreenfootImage("images/NinjaTurnedArround.png"));
            p3Sprites.add(new GreenfootImage("images/NinjaWalkingTurnedArround1.png"));
            p3Sprites.add(new GreenfootImage("images/NinjaWalkingTurnedArround2.png"));
            
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
        int x=0;
        int y=0;
        
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
    
    handleDirection();
    nextSprite();
    check();
    if(info.getVida() == 0){
    FinDelJuego fin = new FinDelJuego();
                Greenfoot.setWorld(fin);
    }
    
    }
    
    public void check(){
        if(this.isTouching(VisionRange.class)){
            info.quitarVida();
        }
    }
    
    public void handleDirection()
    {
        int x = getX();
        int y = getY();
        int OFFSET = 5;

        if(Greenfoot.isKeyDown("d"))
        {
           Actor collide=getOneObjectAtOffset(20,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x + OFFSET, y);
            
            //setRotation(0);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
           Actor collide=getOneObjectAtOffset(-20,0,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x - OFFSET, y);
            //setRotation(-180);
        }
        else if(Greenfoot.isKeyDown("w"))
        {
            Actor collide=getOneObjectAtOffset(0,-20,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y - OFFSET);
            //setRotation(-90);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            Actor collide=getOneObjectAtOffset(0,20,Wall.class);
            if(collide!=null)
            {
                OFFSET=0;
            }
            setLocation(x, y + OFFSET);
            //setRotation(-270);
        }
    }
}
