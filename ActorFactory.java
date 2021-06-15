import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ActorFactory  
{
    public static Actor getActor(int type){
        if(type == 1){
            return new Wall();
        }
        if(type == 2){
            return new Ninja();
        }
        if(type == 3){
            return new Enemy1(new VisionRange());
        }
        if(type == 4){
            return new Enemy2(new VisionRange());
        }
        if(type == 5){
            return new Robot(new VisionRange());
        }
        if(type == 6){
            return  new Rejilla();
        }
        return null;
    }
}