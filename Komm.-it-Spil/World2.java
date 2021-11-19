import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World2 extends World
{
    private int addenemy_1 = 0;
    private int addenemy_2 = 0;
    public World2()
    {    
        super(800, 800, 1); 
        spawn();
    }
    public void spawn()

    {
        addObject(new Player(),150,150);
        
        while (addenemy_1 < 0)
        {
            addObject(new enemy_1(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_1++;
        }
        while (addenemy_2 < 3)
        {
            addObject(new enemy_2(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_2++;
        }
    }
    
}