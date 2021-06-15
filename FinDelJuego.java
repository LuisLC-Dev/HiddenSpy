import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FinDelJuego extends World
{
    public FinDelJuego(InformacionNinja info)
    {  
        super(960, 540, 1);
        setBackground("gameOver.png");
        showText(info.getPuntaje(),380, 270);
        addObject(new ButtonVolverAJugar(),800, 460);
    }
}
