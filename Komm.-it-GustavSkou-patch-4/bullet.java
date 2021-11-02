import greenfoot.*;

public class bullet extends Actor
{
    public void act()
    {
        move(20);
         
        //henter actors
        Actor bullet;
        Actor enemy;
        
        //henter cordinaterne
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy = getOneObjectAtOffset(0, 0, enemy.class);
        
        //Edge
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        //hit
        if (bullet != enemy)
        {
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
            hit();
        }
        
    }
    private void hit()
    {
        World1 World1 = (World1) getWorld();
        Counter Counter = World1.getCounter();
        Counter.bumpCount(1);
    }
}