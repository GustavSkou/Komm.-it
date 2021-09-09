import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World1 extends World
{
    public World1()
    {    
        super(1000, 800, 1); 
        spawn();
    }
    
    public void act()
    {
        if (getObjects(next.class).isEmpty())
        {
                  Greenfoot.setWorld(new sky());
        }
    }
    
    public void spawn()
    
    {
        Main Main = new Main();
        addObject(Main,150,150);
        
        next next = new next();
        addObject(next,350,600);
        
        bug bug = new bug();
        addObject(bug,500,500);
    }
}