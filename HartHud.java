import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HartHud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HartHud extends Mover
{
   public static int hart=2;
   
    public void act() 
    {
        if(hart==1){setImage("hud_heartHalf.png");}
        if(hart==0){setImage("hud_heartEmpty.png");}
        // Add your action code here.
    }    
}
