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
    
    public void kill()
    {
        //henter actors
        Actor bullet; 
        Actor bug;
        //henter cordinaterne
        bullet = getOneObjectAtOffset(0, 0, bullet.class);
        bug = getOneObjectAtOffset(0, 0, bug.class);
        
        if (bullet != bug)
        {
            World world;
            world = getWorld();
            world.removeObject(bug);
        }
    }
    
}