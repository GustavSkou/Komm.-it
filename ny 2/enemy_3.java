import greenfoot.*;

public class enemy_3 extends Actor
{
    int time;
    
    public enemy_3()
    {
        GreenfootImage image = getImage();  
        image.scale(60, 60);
        setImage(image);
    }
    
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
        int mainX = 0;
        int mainY = 0;
        int angle = getRotation();
        if (getWorld().getObjects(Main.class).size() != 0)
        {
            Actor M = (Actor)getWorld().getObjects(Main.class).get(0);
            mainX = M.getX();
            mainY = M.getY();
        }

        if (getWorld().getObjects(enemy_3.class).size() != 0)
        {
            Actor E = (Actor)getWorld().getObjects(enemy_3.class).get(0);
            enemyX = getX();
            enemyY = getY();
        }
        
        
        if (mainX > enemyX)
        {
            setLocation(enemyX+1, enemyY);
        }
        if (mainX < enemyX)
        {
            setLocation(enemyX-1, enemyY);
        }
        if (mainY > enemyY)
        {
            setLocation(enemyX, enemyY+1);
        }
        if (mainY < enemyY)
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
        if (getWorld().getObjects(Main.class).size() != 0)
        {
            Actor M = (Actor)getWorld().getObjects(Main.class).get(0);
            turnTowards(M.getX(), M.getY());
        }
        else
        {
            turn(5);
        }
    }
}