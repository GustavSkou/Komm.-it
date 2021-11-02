import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World1 extends World
{
    private int addenemy = 0;
    private Counter Counter;
    
    public World1()
    {    
        super(800, 800, 1); 
        addObject(new Main(),150,150);
        Counter = new Counter();
        addObject(Counter, 40, 340);
        while (addenemy < 3)
        {
            addObject(new enemy(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy++;
        }
    }
    public void spawn()

    {
        
    }
    
    public Counter getCounter()
    {
        return Counter;
    }
}