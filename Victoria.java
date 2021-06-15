import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Victoria extends World
{
    public Victoria(InformacionNinja info)
    {    
        super(960, 540, 1);
        setBackground("Felicidades.png");
        showText(info.getPuntaje(),380, 270);
    }
}