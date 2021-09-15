import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends Actor
{
    //cooldown vars
    private boolean readEnter = true;
    private Cooldown myCooldownmissil;
    
    public Main()
    {
        myCooldownmissil = new Cooldown(); //Tilføjet cooldown til jet1
    }
    public void act()
    {   
        int angle = getRotation();
        
        Actor Main; 
        Actor next;
        Actor enemy;
        Actor bullet;
        int x = getX();
        int y = getY();
        
        Main = getOneObjectAtOffset(0, 0, Main.class);
        next = getOneObjectAtOffset(0, 0, next.class);
        enemy = getOneObjectAtOffset(0, 0, enemy.class);
        
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
        
        if (Greenfoot.isKeyDown("space"))
        {
            if(myCooldownmissil.Cooldownmissil()) //Cooldown bliver taget i brug
            {
                bullet(); //Missil affyrings mekanisme bliver sat igang
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
}