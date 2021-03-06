import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Player extends Actor
{
    //vars
    private boolean readEnter = true;
    private Cooldown myCooldown;
    private int hp = 3;
    //public int dmg = 1;
    private int enemykill;
    private int spawnCounter;
    
    
    public Player()
    {
        myCooldown = new Cooldown();
        enemykill = 0;
        spawnCounter = 0;
    }
    
    public void act()
    {   
        int angle = getRotation();
        int x = getX();
        int y = getY();
        
        checkCollision();
        
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(x-3, y);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(x+3, y);
        }
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(x, y-3);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(x, y+3);
        }
        
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x+2, y-2);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("w"))  
        {
            setLocation(x-2, y-2);
        }
        if (Greenfoot.isKeyDown ("d") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x+2, y+2);
        }
        if (Greenfoot.isKeyDown ("a") && Greenfoot.isKeyDown("s"))  
        {
            setLocation(x-2, y+2);
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
            //score++;
            spawnCounter++;
        }
    }
    
    public void addNewEnemy()
    {
        if (spawnCounter == 1)
        {
            getWorld().addObject( new enemy_1(), Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(800));
            spawnCounter = 0;
        }
    }
    
    /*
    public void hit()
    {
        hp = hp - myenemy_bullet.bulletdmg;
        if (hp == 0);
        {
            Greenfoot.stop();
        }
    }
    */
   
    public void checkCollision()
       {
        enemy_bullet myenemy_bullet = (enemy_bullet)getOneIntersectingObject(enemy_bullet.class);
        
        if (myenemy_bullet != null)
        {   
            hp = hp - myenemy_bullet.getBulletDmg();
        }
        
        if (hp == 0)
        {   
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }
}