import greenfoot.*;

public class bullet extends Actor
{
    public void act()
    {
        move(20);
        
        //henter actors
        Actor bullet;
        //henter cordinaterne
        
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            getWorld().removeObject(this);              // missil2 fjernes
        }
    }   
}