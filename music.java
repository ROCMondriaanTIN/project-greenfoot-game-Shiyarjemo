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
    
    public Music() {
        super();
        setImage("pause.png");
    }

                  
    public void act() 
    {
        // Add your action code here.
         if(firstTrun){
        firstTrun = false;
         sound.playLoop();
        }
        
        if(Greenfoot.mouseClicked(this)){
        if(sound.isPlaying()){
                sound.pause();
        setImage("play.png");
        
        
        }
         else{
               sound.playLoop();
            setImage("pause.png");
             
       }
       
        
        
        }
         if(isTouching(Snail.class)||isTouching(Poker.class)||
            isTouching(Slime.class)||isTouching(Fire.class)
            ||isTouching(FlyVijand.class)||isTouching(Water.class)){Hud_Key.hudKey=0;

            sound.pause();

                return;
            }
     
    }    
}
