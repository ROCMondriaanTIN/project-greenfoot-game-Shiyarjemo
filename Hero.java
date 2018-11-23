import greenfoot.*;


public class Hero extends Mover {

    private  double gravity;
    private  double acc;
    private  double drag;

    int spring = -15;
    int karakter = 0;
    int loop = 0;
    int duck = 0;
    int snelheidBlauwKarakter=0;
public int keyYellow =0;



 //=====
 

   
    public Hero() {
        
        super();
        gravity = 5.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
      
    }
   public void enemyDood(){
            
            
            }
    @Override
    public void act() {
      
        handleInput();
    enemyDood();
        applyVelocity();
        rozeKarakter();
        blauweKarakter();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }

        //=============1===========
        if(isTouching(Snail.class)||isTouching(Poker.class)||
            isTouching(Slime.class)||isTouching(Fire.class)
            ||isTouching(FlyVijand.class)||isTouching(Water.class)){Hud_Key.hudKey=0;
                HartHud.hart--;
                this.setLocation(300, 200);
                if( HartHud.hart==0){Hud_Ster.aantalSter =0;
                DiamantHud.diamantHud=0;
                Diamant.diamant=0;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
            HartHud.hart=2;
            }
                
                
                return;
            }
        for (Actor Box : getIntersectingObjects(Box.class)) {
            if (Box != null) {
                Hud_Key.hudKey=0;
                getWorld().removeObject(Box);
            
                Diamant.diamant=1;
                Greenfoot.playSound("colect.mp3");
                return;
            }}
            
         
        for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
                getWorld().removeObject(Key);
                keyYellow=1;
                Hud_Key.hudKey++;
                Greenfoot.playSound("colect.mp3");
                return;
            }}
        for (Actor LockYellow  : getIntersectingObjects(LockYellow.class)) {
            if (LockYellow != null&&keyYellow==1) {
                this.setLocation(5600, 253);
                return;}}

        for (Actor Diamant : getIntersectingObjects(Diamant.class)) {
            if (Diamant != null) {
                DiamantHud.diamantHud=1;

                getWorld().removeObject(Diamant);
                return;
            }}
  
        for (Actor Star : getIntersectingObjects(Star.class)) {
            if (Star != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Star);
                 Hud_Ster.aantalSter=Hud_Ster.aantalSter;
                  Hud_Ster.aantalSter++;
                return;
            }}

       Hud_Ster.aantalSter=Hud_Ster.aantalSter; 
        
        for (Actor Deur : getIntersectingObjects(Deur.class)) {
            DiamantHud.diamantHud=DiamantHud.diamantHud;
            if (Deur != null)
                  
                        Greenfoot.playSound("deurOpen.mp3");
                        Greenfoot.setWorld(new LevelChoose()); 
                      
                        
                        return;
                    } }
        
        

    public void rozeKarakter(){  
        for (Actor RozeKarakter : getIntersectingObjects(RozeKarakter.class)) {
            if (RozeKarakter != null) {
                getWorld().removeObject(RozeKarakter);  
                Greenfoot.playSound("muntKarakter.mp3");
                setImage("p3_walk02.png");
                karakter =2;
              
                duck = 3;
                spring = -11;
                gravity = 4.8;
                return;
            }
        }
        //===============Size Change===================
        //GreenfootImage myImage = getImage();
        //int newSizeHeight = (int)myImage.getHeight()-30;
        //int newSizeWidth = (int)myImage.getWidth()-30;
        //myImage.scale(newSizeWidth, newSizeHeight);

    }

    public void blauweKarakter(){  
        for (Actor BlauweKarakter : getIntersectingObjects(BlauweKarakter.class)) {
            if (BlauweKarakter != null) {
                getWorld().removeObject(BlauweKarakter);  
                Greenfoot.playSound("muntKarakter.mp3");
                setImage("p2_walk11.png");
                karakter =4;
                duck =5;
                spring =-19;
                gravity =5.5;
                this.drag =0.9;
                snelheidBlauwKarakter=2;
              
                return;
            }
        }
       
    }

    boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
        return under != null;}



   
    
    public void handleInput() {

        
        
        if ((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&onGround() == true && karakter==0) {
            setImage("p1_jump.png");
            Greenfoot.playSound("jump.mp3");

            velocityY = spring;
            karakter= 1;   
        }
        if(karakter==1&&onGround() == true){karakter-=1;
            setImage("p1.png");}
        if ((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&&duck==0) {
            setImage("p1_duck.png");
            velocityX =2;
            duck =1;
        }
        if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&duck==1){
            setImage("p1.png");
            duck-=1;
        }
        //==========2 Roze=============

        if ((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&onGround()==true && karakter==2) {
            setImage("p3_jump.png");
            Greenfoot.playSound("jump.mp3");

            velocityY = -11;
            karakter=3;   
        }

        if(karakter==3&&onGround() == true){karakter-=1;
            setImage("p3_walk02.png");}
        if ((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&&duck==2) {
            setImage("p3_duck.png");
            velocityX = 2;
            duck =3;

        }
        if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&duck==3){
            setImage("p3_stand.png");
            duck-=1;
        }
        //==============3=============

        if ((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up")||Greenfoot.isKeyDown("space"))&&onGround() == true && karakter==4) {
            setImage("p2_jump.png");
            Greenfoot.playSound("jump.mp3");

            velocityY = spring;
            karakter=5;   
        }

        if(karakter==5&&onGround() == true){karakter-=1;
            setImage("p2_walk11.png");}
        if ((Greenfoot.isKeyDown("down")||Greenfoot.isKeyDown("s"))&&duck==5) {
            setImage("p2_duck.png");
            velocityX = 2;
            duck =6;

        }
        if((Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))&&duck==6){
            setImage("p2_jump.png");
            duck-=1;
        }
        //============================ 
        if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&&snelheidBlauwKarakter==2) {
            velocityX = -6;

        }
        if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& snelheidBlauwKarakter==2) {
            velocityX = 6;

        }
        if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& snelheidBlauwKarakter==0) {
                    velocityX = -3;  
        
        }  if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& snelheidBlauwKarakter==0) {
            velocityX = 3;
         
        }
    }



    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}