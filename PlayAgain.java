import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playAgain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayAgain extends Mover
{
    /**
     * Act - do whatever the playAgain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound sound = new GreenfootSound("kurdish-music.mp3");
                  boolean firstTrun = true;
                 
    public void act() 
    {
        // Add your action code here.
        click();

         
            
        
    }    
            public void click() 
    {
        sound.playLoop();
        if(Greenfoot.mouseClicked(this)){
        sound.pause();
            Greenfoot.setWorld(new level1());
     
        }
}}
