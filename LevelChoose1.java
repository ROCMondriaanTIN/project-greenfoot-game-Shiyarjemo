import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelChoose1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelChoose1 extends Actor
{
    /**
     * Act - do whatever the LevelChoose1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
       
            Greenfoot.setWorld(new Level1());
         
            
        
    }    
    }    
}
