import greenfoot.*;

public class enemy_bullet extends Actor
{
    private int bulletdmg = 1;
    private int hit = 0;
    
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
        Actor a = getOneIntersectingObject(Player.class);
          
        
        if (a != null){   
            if (hit == 0){
                hit = 1;
            }
        }
        if (a == null && hit == 1){
            World world;  
            world = getWorld();  
            world.removeObject(this);
            
        }
    }
    
    public int getBulletDmg(){
        if (bulletdmg == 1)
        {
            bulletdmg = 0;
            return 1;
        }
        
        else
        { 
            return 0;
        }
    }
}