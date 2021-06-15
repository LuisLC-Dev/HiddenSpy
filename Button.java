import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Una clase Button de la cual heredan los diferentes botones, checa si es 
 * presionado, y realiza una accion que debe definir cada una de las subclases
 * de botones.
 * 
 * @author (Hector Gustavo Hernandez Reyes) 
 * @version (13/06/2021)
 */
public abstract class Button extends Actor
{
    /**
     * Act - En este caso, se verifica si un boton es presionado, cuando esto
     * pasa pues se realiza una accion dependiendo del boton haciendo uso del
     * polimorfismo.
     */
    public void act()
    {
        checkIsButtonIsPressed();
    }
    
    final void checkIsButtonIsPressed(){
        if (Greenfoot.mousePressed(this)){
            buttonAction();
        }
    }
    
    abstract void buttonAction();
}
