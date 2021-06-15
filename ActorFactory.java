import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ActorFactory  
{
    public static Actor getActor(int type, InformacionNinja info){
        if(type == 1){
            return new Wall();
        }
        if(type == 2){
            return new Ninja(info);
        }
        if(type == 3){
            return new Enemy1();
        }
        if(type == 4){
            return new Enemy2();
        }
        if(type == 5){
            return new Robot();
        }
        if(type == 6){
            return  new Rejilla(info);
        }
        return null;
    }
}