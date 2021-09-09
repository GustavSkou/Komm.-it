import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World2 extends World
{
    public World2()
    {    
        super(1000, 800, 1); 
        spawn();
    }
    
    public void act()
    {
        //if (getObjects(next.class).isEmpty())
        //{
        //          Greenfoot.setWorld(new World2());
        //}
    }
    
    public void spawn()
    
    {
        Main Main = new Main();
        addObject(Main,150,550);
        
        next next = new next();
        addObject(next,100,600);
        
        bug bug = new bug();
        addObject(bug,600,600);
    }
}