import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DiamantHud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamantHud extends Mover
{
public static int diamantHud = 0;
    public void act() 
    {reset();
           if(diamantHud>0){
    setImage("hud_gem_blue.png");
    } }
public void reset(){
    this.diamantHud = diamantHud;
}
        // Add your action code here.
       
}
