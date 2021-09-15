import greenfoot.*;

public class enemy_bullet extends Actor
{
    public void act()
    {
        move(7);
        
        //henter actors
        Actor enemy_bullet;
        Actor Main;
        
        //henter cordinaterne
        enemy_bullet = getOneObjectAtOffset(250, 250, enemy_bullet.class);
        Main = getOneObjectAtOffset(0, 0, Main.class);
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        if (Main != enemy_bullet)
        {
            World world;
            world = getWorld();
            world.removeObject(Main);
            Greenfoot.stop();
        }
    }
}