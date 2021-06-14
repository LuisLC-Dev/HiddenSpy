import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Jugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonJugar extends Button
{
    /**
     * Act - do whatever the Button_Jugar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    static ButtonJugar instance;
    
    private ButtonJugar(){}
    
    public static ButtonJugar getInstance(){
        if (instance == null){
            instance = new ButtonJugar();
        }
        return instance;
    }
    
    void buttonAction(){
        getWorld().showText("Boton Jugar",100, 100);
    } 
}