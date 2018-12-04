import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class slimeWalk1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Mover
{ public static String image;
    public static int totaalStar;
    public Star() {setImage("star.png");
 
    }

    @Override
    public void act() {
      
        applyVelocity();
        
    }
}