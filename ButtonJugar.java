import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Este es un boton que al ser presionado incia el juego, osea crea un nuevo
 * mundo donde estara mi primer nivel
 * 
 * @author (Hector Gustavo Hernandez Reyes) 
 * @version (14/06/2021)
 */
public class ButtonJugar extends Button
{
    static ButtonJugar instance;
    
    private ButtonJugar(){}
    
    public static ButtonJugar getInstance(){
        if (instance == null){
            instance = new ButtonJugar();
        }
        return instance;
    }
    
    void buttonAction(){
        Juego juego = new Juego(1, 27, 17);
        Greenfoot.setWorld(juego);
    } 
}