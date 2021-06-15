import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Este es un boton que al ser presionado muestra las instrucciones de nuestro
 * juego, para que sepan como jugar.
 * 
 * @author (Hector Gustavo Hernandez Reyes) 
 * @version (14/06/2021)
 */
public class ButtonAyuda extends Button
{
    public ButtonAyuda(){
        setImage("images/button_ayuda.png");
    }
    
    void buttonAction(){
        Ayuda ayuda = new Ayuda(getWorld());
        Greenfoot.setWorld(ayuda);
    }  
}