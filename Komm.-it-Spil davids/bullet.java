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
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        
        if (bullet != enemy)
        {
            World world;
            world = getWorld();
            world.removeObject(enemy);
            world.removeObject(this);
        }
    }
}