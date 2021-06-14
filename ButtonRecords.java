import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRecords extends Button
{
    /**
     * Act - do whatever the Button_Records wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static ButtonRecords instance;
    
    private ButtonRecords(){}
    
    public static ButtonRecords getInstance(){
        if (instance == null){
            instance = new ButtonRecords();
        }
        return instance;
    }
    
    void buttonAction(){
        getWorld().showText("Boton Records",100, 200);
    } 
}