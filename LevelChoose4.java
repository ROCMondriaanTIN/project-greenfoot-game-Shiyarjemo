import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelChoose4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelChoose4 extends Actor
{
    /**
     * Act - do whatever the LevelChoose4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("level4.png");
        if(Greenfoot.mouseClicked(this)){
       
            Greenfoot.setWorld(new Level4());}
        // Add your action code here.
    }    
}
