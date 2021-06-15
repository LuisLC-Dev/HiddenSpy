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