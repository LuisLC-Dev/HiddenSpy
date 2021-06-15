import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ayuda extends World
{
    public Ayuda(World world)
    {    
        super(600, 400, 1);
        addObject(new ButtonRegresar(world),500,350);
    }
}
