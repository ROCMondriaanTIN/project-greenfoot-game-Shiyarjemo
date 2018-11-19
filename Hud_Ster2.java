import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SterHud2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud_Ster2 extends Mover
{
    /**
     * Act - do whatever the SterHud2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
  public static int hudSter2=0;
  
public void act() 
    { reset();

   if(hudSter2>0){
    setImage("star.png");
    } }
public void reset(){
    this.hudSter2 = hudSter2;
}}
