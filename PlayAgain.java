import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PlayAgain extends Mover
{

    GreenfootSound sound = new GreenfootSound("kurdish-music.mp3");
    boolean firstTrun = true;

    public void act() 
    {
        // Add your action code here.

        sound.playLoop();
        if(Greenfoot.mouseClicked(this)||Greenfoot.isKeyDown("space")){

            Greenfoot.setWorld(new Level1());
            sound.pause();
        }    

    }}
