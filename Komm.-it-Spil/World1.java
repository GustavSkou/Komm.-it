import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class World1 extends World
{
    private int addenemy_1 = 0;
    private int addenemy_2 = 0;
    private int addenemy_3 = 0;
    public World1()
    {    
        super(800, 800, 1); 
        spawn();
    }
    public void spawn()

    {
        addObject(new Player(),150,150);
        
        while (addenemy_1 < 1)
        {
            addObject(new enemy_1(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_1++;
        }
        while (addenemy_2 < 0)
        {
            addObject(new enemy_2(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_2++;
        }
        while (addenemy_3 < 1)
        {
            addObject(new enemy_3(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            addenemy_3++;
        }
    }
}