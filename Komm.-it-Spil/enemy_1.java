import greenfoot.*;

public class enemy_1 extends Actor
{
    int time;
    
    public void act()
    {
        shoot();
        look();
        movement();
    }
    
    public void movement()
    {
        move(1);
        /*if (greenfoot.getRandomNumber(100)< 10)
        {
            turn()Greenfoot.getRandomNumber(90) - 45);
        }*/
    }
    
    public void look()
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
    
    public void shoot()
    {
        time++;
        
        Actor bullet;
        Actor enemy_1;
        
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy_1 = getOneObjectAtOffset(0, 0, enemy_1.class);
        if (time == 150)
        {
            bullet();
            time = 0;
        }
        if (bullet != enemy_1)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet);
            world.removeObject(this);
        }
    }
    
    public void bullet()
    {
        enemy_bullet enemy_bullet = new enemy_bullet();
        getWorld().addObject(enemy_bullet, getX(), getY());
        enemy_bullet.setRotation(getRotation()); 
    }
}