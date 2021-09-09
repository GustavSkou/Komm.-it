import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class bug extends Actor
{
        public void kill()
    {
        //henter actors
        Actor Main; 
        Actor bug;
        //henter cordinaterne
        Main = getOneObjectAtOffset(0, 0, Main.class);
        bug = getOneObjectAtOffset(0, 0, bug.class);
        
        if (Main != bug)
        {
            World world;
            world = getWorld();
            world.removeObject(bug);
        }
    }
}