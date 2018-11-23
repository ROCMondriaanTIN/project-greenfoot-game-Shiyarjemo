import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deur extends Mover
{World world;

   public  Deur(String image){
   super();
   this.world=world;
    setImage(image);
    
    }
    public void act() 
    {
        // Add your action code here.
         applyVelocity();
    }    
}
