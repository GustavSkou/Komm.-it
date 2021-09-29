import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int hp;
    
    public void act()
    {
        move(7);
        
        hp = 3;

        Actor enemy_bullet;
        Actor Main;
        
        enemy_bullet = getOneObjectAtOffset(250, 250, enemy_bullet.class);
        Main = getOneObjectAtOffset(0, 0, Main.class);
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        /*if (Main != enemy_bullet)
        {
            World world;  
            world = getWorld();  
            world.removeObject(this);
            //world.removeObject(Main);
            hp -= 1;
        }
        if (hp == 0)
        {
            World world;
            world = getWorld();
            world.removeObject(Main);
            Greenfoot.stop();
        }*/
        
    }
    public void hitPlayer()
    {
        Actor actor;
        actor = getOneObjectAtOffset(0, 0, Player.class);
        if(actor != null)
        {
            getWorld().removeObject(this);
            Player.hit(DMGE);
        }
    }
}