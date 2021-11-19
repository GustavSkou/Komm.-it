import greenfoot.*;

public class enemy_bullet extends Actor
{
    public int bulletdmg = 1;
    
    public void act()
    {
        move(7);
        checkCollision();
        
        //Actor main;
        //Actor enemy_bullet;
        //Actor a;
        
        
        //enemy_bullet = getOneObjectAtOffset(x, y, enemy_bullet.class);
        //main = getOneObjectAtOffset(0, 0, Main.class);
            
        /*if (isAtEdge())
        {
            getWorld().removeObject(this);
        }*/
    }
    
    public void checkCollision()
    {
        Actor a = getOneIntersectingObject(enemy_bullet.class);
        //Main myMain = new Main();
        if (a != null){   
            
            World world;  
            world = getWorld();  
            world.removeObject(this);
            
        }
    }
}