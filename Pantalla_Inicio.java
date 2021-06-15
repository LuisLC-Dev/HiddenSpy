import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pantalla_Inicio extends World
{
    public Pantalla_Inicio()
    {   
        super(960, 540, 1);
        addElements();
    }
    
    void addElements(){
        addObject(ButtonJugar.getInstance(),480,300);
        addObject(new ButtonAyuda(),480,380);
        addObject(new ButtonRecords(),480,460);
    }
}