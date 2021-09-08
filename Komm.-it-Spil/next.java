import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class next extends Actor
{
    int x = 0;
    
    public void act() 
    {
        //henter actors
        Actor Main; 
        Actor next;
        //henter cordinaterne
        Main = getOneObjectAtOffset(0, 0, Main.class);
        next = getOneObjectAtOffset(0, 0, next.class);
        
        move(x);
        if (next != Main) //hvis cordinaterne for "missil2" og "jet1" er ens
        {
            World world;
            world = getWorld();
            world.removeObject(Main);
            x=5;
        }
    
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    
    }    
}