import greenfoot.*;

public class enemy extends Actor
{
    int time;
    
    public void act()
    {
        time++;
        
        Actor Main = (Actor)getWorld().getObjects(Main.class).get(0);
        
        turnTowards(Main.getX(), Main.getY());
        
        move(1);
        
        if (time == 150)
        {
            bullet();
            time = 0;
        }
    }
    
    public void bullet()
    {
        enemy_bullet enemy_bullet = new enemy_bullet();
        getWorld().addObject(enemy_bullet, getX(), getY());
        enemy_bullet.setRotation(getRotation()); 
    }
}