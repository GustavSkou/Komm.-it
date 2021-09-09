import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sky extends World
{
    public sky()
    {    
        super(1000, 800, 1); 
        spawn();
    }
    
    public void act()
    {
        if (getObjects(next2.class).isEmpty())
        {
               Greenfoot.setWorld(new World2());
        }
    }
    
    public void spawn()
    
    {
        next2 next2 = new next2();
        addObject(next2,100,600);
    }
}
