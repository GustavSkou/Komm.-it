import greenfoot.*;

public class BigBoom extends Actor
{
    private int timer = 0;
    public void act() 
    {
       timer++;
       if (timer == 10)
       {
         getWorld().removeObject(this);
       }
    }  
}