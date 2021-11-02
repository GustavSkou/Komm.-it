import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spawn extends Actor
{
   
    
    public void act() 
    {
        getWorld().addObject(new enemy(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
    }    
}
