import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.util.*;

public class Juego extends World
{
    InformacionNinja info;
    public Juego(int numNivel, int ancho, int alto, World world, InformacionNinja info)
    {    
        super(1300,680, 1);
        this.info = info;
        cargaNivel(numNivel, ancho,alto, info);
        addButtons(world);
        info.draw(this);
    }
    
    private void cargaNivel(int numNivel, int ancho, int alto, InformacionNinja info){
        setPaintOrder(Ninja.class,Wall.class);
        try{
            File nivel = new File("Nivel " + numNivel + ".txt");
            Scanner sc = new Scanner(nivel);
            for(int i = 0; i < alto; i++){
                for(int j = 0; j < ancho; j++){
                    int num = sc.nextInt();
                    if(num != 0){
                        Actor aux = ActorFactory.getActor(num, info);
                        addObject(aux,20+40*j,20+40*i);
                        if(num == 3 || num == 4 ||num == 5)
                        {
                            Enemy ene = (Enemy)aux;
                            ene.addVisionRange();
                        }
                    }
                    
                }
            }
            sc.close();
        }catch (FileNotFoundException e){Greenfoot.stop();}
    }
    
    void addButtons(World world){
        addObject(new ButtonRegresar(world),1200, 640);
        addObject(new ButtonAyuda(),1200, 580);
        addObject(new ButtonRecords(),1200, 520);
    }
    
    public void act(){
        info.draw(this);
        if(info.getVida() <= 0){
            FinDelJuego fin = new FinDelJuego(info);
            Greenfoot.setWorld(fin);
        }
    }
}
