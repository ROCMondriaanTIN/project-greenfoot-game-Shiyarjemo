import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AantalSters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AantalSters extends Mover
{
    /**
     * Act - do whatever the AantalSters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  if(Hud_Ster.aantalSter==0){setImage("hud_0.png");}
        if(Hud_Ster.aantalSter==1){setImage("hud_1.png");}
    if(Hud_Ster.aantalSter==2){setImage("hud_2.png");}
     if(Hud_Ster.aantalSter==3){setImage("hud_3.png");}
      if(Hud_Ster.aantalSter==4){setImage("hud_4.png");}
       if(Hud_Ster.aantalSter==5){setImage("hud_5.png");}
        if(Hud_Ster.aantalSter==6){setImage("hud_6.png");}
         if(Hud_Ster.aantalSter==7){setImage("hud_7.png");}
          if(Hud_Ster.aantalSter==8){setImage("hud_8.png");}
           if(Hud_Ster.aantalSter==9){setImage("hud_9.png");}
        // Add your action code here.
    }    
}
