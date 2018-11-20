import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hud_Ster3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud_Ster3 extends Mover
{
  public static int hudSter3=0;
    public void act() 
   
        
    { reset();

   if(hudSter3>0){
    setImage("star.png");
    } }
public void reset(){
    this.hudSter3 = hudSter3;
}}