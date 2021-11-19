import greenfoot.*;

public class bullet extends Actor
{
    public void act()
    {
        move(20);
        
        
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
        
        
        
    }
}