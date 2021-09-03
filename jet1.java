import greenfoot.*;

public class jet1 extends Actor
{
    //vars
    int speed = 4;
    
    //cooldown vars
    private boolean readEnter = true;
    private Cooldown myCooldownmissil;

    public jet1()
    {
        myCooldownmissil = new Cooldown(); //Tilføjet cooldown til jet1
    }
    
    //================================================================================
    //  Movement
    //================================================================================
    public void act()
    {
        move(speed);
        
        if (Greenfoot.isKeyDown("a"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("w")) //hvis man holder "w" inde øger man jet2's fart med 3
        {
            move(speed+3); 
        }
        
        if ("space".equals(Greenfoot.getKey()))
        {
            if(myCooldownmissil.Cooldownmissil()) //Cooldown bliver taget i brug
            {
                missil1(); //Missil affyrings mekanisme bliver sat igang
            }
        }
    }
    
    //================================================================================
    //  Spawn missil
    //================================================================================
    public void missil1()
    {
        missil1 missil1 = new missil1();
        getWorld().addObject(missil1, getX(), getY());  //indsætter missil1 ved cordinaterne af jet1
        missil1.setRotation(getRotation());             //sætter rotation af missilen til det samme som jet1
        missil1.move(60);                               //flytter missil1 60 pixels frem
    }
}
 

