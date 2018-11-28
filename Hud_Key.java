import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hud_Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hud_Key extends Mover
{
    /**
     * Act - do whatever the Hud_Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int hudKey=0;

    public static void hudKey(){
        
    
}
    public void act() 
    { reset();

   if(hudKey>0){
    setImage("hud_keyYellow.png");
    } }
public void reset(){
    this.hudKey = hudKey;

}  }
  
     
        

