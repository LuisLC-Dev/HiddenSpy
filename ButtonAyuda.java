import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Ayuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonAyuda extends Button
{
    /**
     * Act - do whatever the Button_Ayuda wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static ButtonAyuda instance;
    
    private ButtonAyuda(){}
    
    public static ButtonAyuda getInstance(){
        if (instance == null){
            instance = new ButtonAyuda();
        }
        return instance;
    }
    
    void buttonAction(){
        getWorld().showText("Boton Ayuda",100, 150);
    }  
}