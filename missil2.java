import greenfoot.*;

public class missil2 extends Actor
{
    public void act()
    {
        move(20);
        
        //henter actors
        Actor jet1;
        Actor missil2;
        //henter cordinaterne
        jet1 = getOneObjectAtOffset(0, 0, jet1.class);
        missil2 = getOneObjectAtOffset(0, 0, missil2.class);
        
        //================================================================================
        //  Death
        //================================================================================
        if (missil2 != jet1) //hvis cordinaterne for "missil2" og "jet1" er ens 
        {
            World world;
            world = getWorld();
            world.removeObject(jet1);               //jet1 fjernes
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
            getWorld().addObject(boom, getX(), getY()); //"boom" bliver indsæt ved cordinaterne som missil2 var ved
            getWorld().removeObject(this);              // missil2 fjernes
        }
    }   
}