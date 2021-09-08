import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends Actor
{
    public void act()
    {   
        Actor Main1; 
        Actor next1;
    
        Main1 = getOneObjectAtOffset(0, 0, Main.class);
        next1 = getOneObjectAtOffset(0, 0, next.class);
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-4);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("w")) //hvis man holder "w" inde øger man jet2's fart med 3
        {
            move(3); 
        }
         if (Greenfoot.isKeyDown("s")) //hvis man holder "w" inde øger man jet2's fart med 3
        {
            move(-3); 
        }
        if (Greenfoot.isKeyDown("space")) //hvis man holder "w" inde øger man jet2's fart med 3
        {
            bullet();
        }
    }

    public void bullet()
    {
        bullet bullet = new bullet();
        getWorld().addObject(bullet, getX(), getY());  //indsætter missil1 ved cordinaterne af jet1
        bullet.setRotation(getRotation());             //sætter rotation af missilen til det samme som jet1
        bullet.move(60);                               //flytter missil1 60 pixels frem
    }


}


