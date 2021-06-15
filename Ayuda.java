import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ayuda extends World
{
    public Ayuda(World world)
    {    
        super(960, 540, 1);
        addObject(new ButtonRegresar(world),800,430);
        setBackground("images/Ayuda.png");
    }
}
