import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Diamant extends Mover
{
public static int diamant;
    public Diamant() {
      
        setImage("gemBlue.png");
        
       
        
    }

    @Override
    public void act() {

        applyVelocity();
        if(Diamant.diamant==1||diamant==1){this.setLocation(2186,370);}
    }
}