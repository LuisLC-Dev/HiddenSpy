import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Rejilla extends Actor
{
    private InformacionNinja info;
    
    public Rejilla(InformacionNinja info) 
    {
        this.info = info;
        setImage("images/Rejilla.png");
    }
    
    public void act(){
        check();
    }
    
    public void check(){
        if(this.isTouching(Ninja.class)){
            info.subirNivel();
            if(info.getNivel() <= 3 && info.getVida() > 0){
                Juego juego = new Juego((info.getNivel()), 27, 17,getWorld(), info);
                Greenfoot.setWorld(juego);
            }else{
                FinDelJuego fin = new FinDelJuego();
                Greenfoot.setWorld(fin);
            }
        }
    }
}