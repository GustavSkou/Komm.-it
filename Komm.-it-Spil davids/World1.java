import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World1 extends World
{
    private int addenemy = 0;
    
    public World1()
    {    
        super(800, 800, 1); 
        spawn();
    }
    public void spawn()

    {
        addObject(new Main(),150,150);
        
        while (addenemy < 3)
        {
            addObject(new enemy(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy++;
        }
    }
}