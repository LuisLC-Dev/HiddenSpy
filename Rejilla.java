import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rejilla extends Actor
{
    public Rejilla() 
    {
        setImage("images/Rejilla.png");
    }
    public void act(){
        if(isTouching(Ninja.class)){
            Juego juego = new Juego(2, 27, 17,getWorld());
            Greenfoot.setWorld(juego);
        }
    }
}