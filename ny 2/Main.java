import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends Actor
{
    //vars
    private boolean readEnter = true;
    private Cooldown myCooldown;
    private int speed;
    
    public Main()
    {
        myCooldown = new Cooldown();
        speed = 3;
    }
    
    public void act()
    {
        movement();
        checkCollision();
        
    }
    
    public void movement()
    {   
        int angle = getRotation();
        int x = getX();
        int y = getY();
        
        checkCollision();
        
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(x-speed, y);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(x+speed, y);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(x, y-speed);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(x, y+speed);
        }
        
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x+speed, y-speed);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x-speed, y-speed);
        }
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x+speed, y+speed);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x-speed, y+speed);
        }
        
        if (Greenfoot.isKeyDown("space"))
        {
            if(myCooldown.Cooldown()) //Cooldown bliver taget i brug
            {
                bullet(); //"bullet" bliver sat igang 
            }
        }
        
        setRotation(angle);
        if(Greenfoot.mouseMoved(null))
        {
             MouseInfo mouse = Greenfoot.getMouseInfo();
             turnTowards(mouse.getX(),mouse.getY());
        }
    }
    
    public void bullet()
    {
        bullet bullet = new bullet();
        getWorld().addObject(bullet, getX(), getY());  //indsætter  ved cordinaterne
        bullet.setRotation(getRotation());             //sætter rotation 
        bullet.move(55);
    }
    
    public void score()
    {
        Actor enemy;
        Actor bullet;
            
        enemy = getOneObjectAtOffset(250, 250, enemy_bullet.class);
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        if (bullet != enemy)
        {
            World world;  
            world = getWorld();  
            world.removeObject(enemy);
            world.removeObject(bullet);
        }
    }
    
    public void checkCollision()
    {
        Actor enemy1 = getOneIntersectingObject(enemy_1.class);
        Actor enemy2 = getOneIntersectingObject(enemy_2.class);
        Actor enemy3 = getOneIntersectingObject(enemy_3.class);
        
        speed = 3;
        
        
        if ((enemy1 != null || enemy2 != null))
        {   
            speed = 1;
        }
                
        if (enemy3 != null)
        {   
            speed = 1;
        }
    }
}