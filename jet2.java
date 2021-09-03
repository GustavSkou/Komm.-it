import greenfoot.*;



public class jet2 extends Actor
{
    //vars
    int speed = 4;
       
    //cooldown vars
    private boolean readEnter = true;
    private Cooldown myCooldownmissil;
    public jet2()
    {
        myCooldownmissil = new Cooldown(); //Tilføjet cooldown til jet2
    }
    
    //================================================================================
    //  Movement
    //================================================================================
    public void act()
    {
        move(speed);
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-2);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(2);
        }
        if (Greenfoot.isKeyDown("up")) //hvis man holder "up" inde øger man jet2's fart med 3
        {
            move(speed+3);
        }
        
        
        if(!readEnter && !Greenfoot.isKeyDown("enter"))
            readEnter = true;
        
        
        if(Greenfoot.isKeyDown("enter") && readEnter)
        {
            if(myCooldownmissil.Cooldownmissil())//Cooldown bliver taget i brug
            {
                missil2();
            }
            readEnter = false; 
        }
        
    }
    
    //================================================================================
    //  Spawn missil
    //================================================================================
    private void missil2()
    {
        missil2 missil2 = new missil2();
        getWorld().addObject(missil2, getX(), getY());  //indsætter missil2 ved cordinaterne af jet2
        missil2.setRotation(getRotation());             //sætter rotation af missil2 til det samme som jet2
        missil2.move(60);                               //flytter missil1 60 pixels frem
    }
}