import greenfoot.*;

public class Cooldown
{
    //cooldown vars missil
    private long timePressed = 0; //Det tidspunkt skyd knappen blev trykket
    
    
    public boolean Cooldownmissil()
    {
        {
            //cooldown
            final long cooldownTime = 2000; //Længde der skal væntes
            long time = System.currentTimeMillis(); //Den nuværende tid gemmes 
            if (time > timePressed + cooldownTime) //Hvis den nuværende tid er højere end tiden skyd knappen blev trykket plus den tid der blev sat som cooldowntime må flyet skyde en missil

            { 
                timePressed = time; //timepressed bliver sat til time's værdi for at nulstille cooldown
                return true; //Dette If statement blive til true for at det kan bruges som en værdi som kan implementeres i de individuelle fly
            }
            else
            {
                //Cooldown in progress
                return false; // Det samme som "return true;" men dette fortæller flyet at det ikke my skyde
            }
        }
    }
}
