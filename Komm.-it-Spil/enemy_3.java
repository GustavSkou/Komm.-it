import greenfoot.*;

public class enemy_3 extends Actor
{
    int time;
    public void act()
    {
        death();
        movement();
        dance();
    }
    
    public void death()
    {
        Actor bullet;
        Actor enemy_3;
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy_3 = getOneObjectAtOffset(0, 0, enemy_3.class);
        if (bullet != enemy_3)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet);
            world.removeObject(this);
        }
    }
    
    public void movement()
    {
        int enemyX = 0;
        int enemyY = 0;
        int PlayerX = 0;
        int PlayerY = 0;
        int angle = getRotation();
        if (getWorld().getObjects(Player.class).size() != 0)
        {
            Actor M = (Actor)getWorld().getObjects(Player.class).get(0);
            PlayerX = M.getX();
            PlayerY = M.getY();
        }

        if (getWorld().getObjects(enemy_3.class).size() != 0)
        {
            Actor E = (Actor)getWorld().getObjects(enemy_3.class).get(0);
            enemyX = getX();
            enemyY = getY();
        }
        
        
        if (PlayerX > enemyX)
        {
            setLocation(enemyX+1, enemyY);
        }
        if (PlayerX < enemyX)
        {
            setLocation(enemyX-1, enemyY);
        }
        if (PlayerY > enemyY)
        {
            setLocation(enemyX, enemyY+1);
        }
        if (PlayerY < enemyY)
        {
            setLocation(enemyX, enemyY-1);
        }
        
        if (angle == 45)
        {
            setLocation(enemyX+2, enemyY-2);
            setRotation(0);
        }
        if (angle == 135)
        {
            setLocation(enemyX-2, enemyY-2);
        }
        if (angle == 225)
        {
            setLocation(enemyX-2, enemyY+2);
        }
        if (angle == 315)
        {
            setLocation(enemyX+2, enemyY+2);
        }
    }
    
    public void dance()
    {
        if (getWorld().getObjects(Player.class).size() != 0)
        {
            Actor M = (Actor)getWorld().getObjects(Player.class).get(0);
            turnTowards(M.getX(), M.getY());
        }
        else
        {
            turn(5);
        }
    }
}