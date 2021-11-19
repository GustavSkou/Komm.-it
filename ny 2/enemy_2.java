import greenfoot.*;

public class enemy_2 extends Actor
{
    int time;
    
    public void act()
    {
        time++;
        
        //henter actors
        Actor bullet;
        Actor enemy_2;
        
        //henter cordinaterne
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        enemy_2 = getOneObjectAtOffset(0, 0, enemy_2.class);
        
        move(0);
        if (getWorld().getObjects(Main.class).size() != 0)
        {
            Actor Main = (Actor)getWorld().getObjects(Main.class).get(0);
            turnTowards(Main.getX(), Main.getY());
        }
        else
        {
            turn(5);
        }
        
        if (time == 150)
        {
            bullet();
            time = 0;
        }
        
        if (bullet != enemy_2)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet);
            world.removeObject(this);
        }
    }
    
    public void bullet()
    {
        enemy_bullet enemy_bullet1 = new enemy_bullet();
        enemy_bullet enemy_bullet2 = new enemy_bullet();
        enemy_bullet enemy_bullet3 = new enemy_bullet();
        enemy_bullet enemy_bullet4 = new enemy_bullet();
        enemy_bullet enemy_bullet5 = new enemy_bullet();
        getWorld().addObject(enemy_bullet1, getX(), getY());
        getWorld().addObject(enemy_bullet2, getX(), getY());
        getWorld().addObject(enemy_bullet3, getX(), getY());
        getWorld().addObject(enemy_bullet4, getX(), getY());
        getWorld().addObject(enemy_bullet5, getX(), getY());
        enemy_bullet1.setRotation(getRotation());
        enemy_bullet2.setRotation(getRotation()+45);
        enemy_bullet3.setRotation(getRotation()-45);
        enemy_bullet4.setRotation(getRotation()+22);
        enemy_bullet5.setRotation(getRotation()-22);
    }
}
