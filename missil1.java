import greenfoot.*;

public class missil1 extends Actor
{
    public void act()
    {
        move(20);
        
        //henter actors
        Actor jet2; 
        Actor missil1;
        //henter cordinaterne
        jet2 = getOneObjectAtOffset(0, 0, jet2.class);
        missil1 = getOneObjectAtOffset(0, 0, missil1.class);
        
        //================================================================================
        //  Death
        //================================================================================
        if (missil1 != jet2) //hvis cordinaterne for "missil2" og "jet1" er ens
        {
            World world;
            world = getWorld();
            world.removeObject(jet2);               //jet1 fjernes
            BigBoom boom = new BigBoom();
            world.addObject(boom, getX(), getY());  //"boom" indsætter på de samme cordinater
            //Greenfoot.stop();                       //spillet stoppes
        }
        
        //================================================================================
        //  Edge
        //================================================================================
        if (isAtEdge())
        {
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY()); //"boom" bliver indsæt ved cordinaterne som missil1 var ved
            getWorld().removeObject(this);              // missil2 fjernes
        }
    }   
}