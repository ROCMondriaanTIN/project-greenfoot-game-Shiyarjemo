import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends Mover
{
    
    GreenfootSound sound = new GreenfootSound("music.mp3");
                  boolean firstTrun = true;

    public void act() 
    {
        // Add your action code here.
         if(firstTrun){
        firstTrun = false;
        
        }
        if(Greenfoot.mouseClicked(this)){
        if(sound.isPlaying()){
        sound.pause();
        setImage("play.png");
        
        }
         else{sound.playLoop();
            setImage("pause.png");}
        if(Greenfoot.isKeyDown("1")){sound.setVolume(0);}
        
        
        }
    }    
}
