import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ActorFactory  
{
    public static Actor getActor(int type){
        if(type == 1){
            return new Wall();
        }
        if(type == 2){
            return new Enemy1();
        }
        return null;
    }
}