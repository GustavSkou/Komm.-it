import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends Actor
{
    //vars
    private boolean readEnter = true;
    private Cooldown myCooldown;
    private int hp = 100; 
    public Main()
    {
        myCooldown = new Cooldown();
    }
    public void act()
    {   
        int angle = getRotation();
        
        Actor bullet;
        
        int x = getX();
        int y = getY();
        
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
    
    public void hit(int damage)
    {
        hp = hp - damage;
        if(hp <= 0)
        {
            Greenfoot.stop();
        }
    }
}