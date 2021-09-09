import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class next2 extends Actor
{
    int x = 0;
    public void act() 
    {        
        move(x);
        x=5;
    
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }    
}