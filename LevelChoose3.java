import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelChoose3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelChoose3 extends Actor
{
    /**
     * Act - do whatever the LevelChoose3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       
        if(Greenfoot.mouseClicked(this)){
       
            Greenfoot.setWorld(new Level3());
    }    
}}
