import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hud_Ster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud_Ster extends Mover
{
public static int hudSter=0;
  
public void act() 
    { reset();

   if(hudSter>0){
    setImage("star.png");
    } }
public void reset(){
    this.hudSter = hudSter;
}

}