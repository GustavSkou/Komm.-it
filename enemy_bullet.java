import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int hp;
    
    public void act()
    {
        move(7);
    
        Actor enemy_bullet;
        Actor Main;
            
        enemy_bullet = getOneObjectAtOffset(250, 250, enemy_bullet.class);
        Main = getOneObjectAtOffset(0, 0, Main.class);
            
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
            
        if (Main != enemy_bullet)
        {
            World world;  
            world = getWorld();  
            world.removeObject(this);
        }
    }
}