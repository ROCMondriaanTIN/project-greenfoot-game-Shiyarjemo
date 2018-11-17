import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class diamant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamant extends Mover
{
 


   

    public Diamant() {
      
        setImage("gemBlue.png");
        
    }

    @Override
    public void act() {

        applyVelocity();
       
    }
}