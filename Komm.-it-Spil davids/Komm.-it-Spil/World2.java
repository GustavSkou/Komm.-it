import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World2 extends World
{
    public World2()
    {    
        super(600, 600, 1); 
        spawn();
    }
    
    public void act()
    {
        if (getObjects(next.class).isEmpty())
        {
                  Greenfoot.setWorld(new World1());
        }
    }
    
    public void spawn()
    
    {
                Main Main = new Main();
        addObject(Main,150,150);
        
        next next = new next();
        addObject(next,350,350);
    }
}