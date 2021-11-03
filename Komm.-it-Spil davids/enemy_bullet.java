import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int dmg = 30;
    
    public void act()
    {
        move(7);
    
        Actor enemy_bullet;
        Actor a;
        Main myMain = new Main();
            
        enemy_bullet = getOneObjectAtOffset(250, 250, enemy_bullet.class);
        //myMain = getOneObjectAtOffset(0, 0, Actor.class);
            
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
            
        if  (true)
        {
            World world;  
            world = getWorld();  
            world.removeObject(this);
            myMain.hit();
            //myMain.score();
        }
    }
}