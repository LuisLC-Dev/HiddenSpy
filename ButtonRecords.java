import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button_Records here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRecords extends Button
{
    public ButtonRecords(){
    setImage("button_records.png");
    }
    
    void buttonAction(){
        Records pantRecords = new Records(getWorld());
        Greenfoot.setWorld(pantRecords);
    } 
}