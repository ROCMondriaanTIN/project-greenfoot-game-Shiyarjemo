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

    public Hero() {
        super();
        gravity = 5.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
        applyVelocity();
        rozeKarakter();
        blauweKarakter();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }

        //=============1===========
        for (Actor Poker : getIntersectingObjects(Poker.class)) {
            if (Poker != null) {
           Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());

                return;

            }}
        //=============2===========

        for (Actor Slime : getIntersectingObjects(Slime.class)) {
            if (Slime != null) {
           Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());

                return;

            }}
        //=============3===========  
        for (Actor Fire : getIntersectingObjects(Fire.class)) {
            if (Fire != null) {
                getWorld().removeObject(this);
            Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                Greenfoot.setWorld(new GameOver());
                return;

            }}
        //=============4===========
        for (Actor FlyVijand : getIntersectingObjects(FlyVijand.class)) {
            if (FlyVijand != null) {
                getWorld().removeObject(this);
              Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                Greenfoot.setWorld(new GameOver());
                return;

            }}
        //=============5===========
        for (Actor Snail : getIntersectingObjects(Snail.class)) {
            if (Snail != null) {
                getWorld().removeObject(this);
                Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                Greenfoot.setWorld(new GameOver());
                return;

            }}

        for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
                getWorld().removeObject(Key);

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
                DiamantHud.diamantHud =1;
                getWorld().removeObject(Diamant);
                return;
            }}

        for (Actor Star : getIntersectingObjects(Star.class)) {
            if (Star != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Star);
                Hud_Ster.hudSter=1;
                return;
            }}

        for (Actor Star2 : getIntersectingObjects(Star2.class)) {
            if (Star2 != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Star2);
                Hud_Ster2.hudSter2 =1;
                return;
            }}
        for (Actor Ster3 : getIntersectingObjects(Ster3.class)) {
            if (Ster3 != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Ster3);
                Hud_Ster3.hudSter3 =1;
                return;
            }}
        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Greenfoot.setWorld(new GameOver());
                getWorld().removeObject(this);
                return;

            }}
        for (Actor Door : getIntersectingObjects(Door.class)) {
 if (Door != null && Hud_Ster.hudSter==1 || Hud_Ster2.hudSter2==1|| Hud_Ster3.hudSter3==1 && DiamantHud.diamantHud==1) {  
                Greenfoot.playSound("deurOpen.mp3");
                Greenfoot.setWorld(new LevelChoose()); 
                            Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
           
                return;

            }
         if (Door != null && Hud_Ster.hudSter==1 || Hud_Ster2.hudSter2==1|| Hud_Ster3.hudSter3 ==1 && DiamantHud.diamantHud==0) {  
                Greenfoot.playSound("deurOpen.mp3");

                Greenfoot.setWorld(new Level2()); 
                                                            Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                return;
            }
        }
        for (Actor DoorLevel2 : getIntersectingObjects(DoorLevel2.class)) {
  if (DoorLevel2 != null && Hud_Ster.hudSter==1 || Hud_Ster2.hudSter2==1|| Hud_Ster3.hudSter3==1&&DiamantHud.diamantHud==1) {  
                Greenfoot.playSound("deurOpen.mp3");
                Greenfoot.setWorld(new LevelChoose()); 
                            Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
           
                return;

            }
         if (DoorLevel2 != null && Hud_Ster.hudSter==1 || Hud_Ster2.hudSter2==1|| Hud_Ster3.hudSter3 ==1&&DiamantHud.diamantHud==0) {  
                Greenfoot.playSound("deurOpen.mp3");

                Greenfoot.setWorld(new Level3()); 
                  Hud_Key.hudKey=0;
                Hud_Ster2.hudSter2 =0;
                Hud_Ster.hudSter =0;
                DiamantHud.diamantHud=0;
                Hud_Ster3.hudSter3 =0;
                return;
            }}
    }

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
                spring =-17;
                gravity =5.5;
                this.drag =0.9;
                snelheidBlauwKarakter=2;
                return;
            }
        }
        control();
    }

    boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
        return under != null;}

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")&&onGround() == true && karakter==0) {
            setImage("p1_jump.png");
            Greenfoot.playSound("jump.mp3");
            
            velocityY = spring;
            karakter= 1;   
        }
        if(karakter==1&&onGround() == true){karakter-=1;
            setImage("p1.png");}
        if (Greenfoot.isKeyDown("s")&&duck==0) {
            setImage("p1_duck.png");
            velocityX =2;
            duck =1;
        }
        if(Greenfoot.isKeyDown("w")&&duck==1){
            setImage("p1.png");
            duck-=1;
        }
        //==========2 Roze=============

        if (Greenfoot.isKeyDown("w")&&onGround()==true && karakter==2) {
            setImage("p3_jump.png");
            Greenfoot.playSound("jump.mp3");
         
            velocityY = -11;
            karakter=3;   
        }

        if(karakter==3&&onGround() == true){karakter-=1;
            setImage("p3_walk02.png");}
        if (Greenfoot.isKeyDown("s")&&duck==2) {
            setImage("p3_duck.png");
            velocityX = 2;
            duck =3;

        }
        if(Greenfoot.isKeyDown("w")&&duck==3){
            setImage("p3_stand.png");
            duck-=1;
        }
        //==============3=============

        if (Greenfoot.isKeyDown("w")&&onGround() == true && karakter==4) {
            setImage("p2_jump.png");
            Greenfoot.playSound("jump.mp3");
          
            velocityY = -11;
            karakter=5;   
        }

        if(karakter==5&&onGround() == true){karakter-=1;
            setImage("p2_walk11.png");}
        if (Greenfoot.isKeyDown("s")&&duck==5) {
            setImage("p2_duck.png");
            velocityX = 2;
            duck =6;

        }
        if(Greenfoot.isKeyDown("w")&&duck==6){
            setImage("p2_jump.png");
            duck-=1;
        }
        //============================ 
        if (Greenfoot.isKeyDown("a")&&snelheidBlauwKarakter==2) {
            velocityX = -6;

        }
        if (Greenfoot.isKeyDown("d")&& snelheidBlauwKarakter==2) {
            velocityX = 6;
        }
        if (Greenfoot.isKeyDown("a")&& snelheidBlauwKarakter==0) {
            velocityX = -3;
        }  if (Greenfoot.isKeyDown("d")&& snelheidBlauwKarakter==0) {
            velocityX = 3;
        }
    }

    public void control(){

        if (Greenfoot.isKeyDown("up")&&onGround()==true && karakter==0) {
            setImage("p1_jump.png");
            Greenfoot.playSound("jump.mp3");
         
            velocityY = spring;
            karakter= 1;   
        }
        if(karakter==1&&onGround() == true){karakter-=1;
            setImage("p1.png");}
        if (Greenfoot.isKeyDown("down")&&duck==0) {
            setImage("p1_duck.png");
            velocityX =2;
            duck =1;
        }
        if(Greenfoot.isKeyDown("up")&&duck==1){
            setImage("p1.png");
            duck-=1;
        }
        //==========2 roze=============

        if (Greenfoot.isKeyDown("up")&&onGround()==true & karakter==2) {
            setImage("p3_jump.png");
            Greenfoot.playSound("jump.mp3");
        
            velocityY = spring;
            karakter=3;   
        }

        if(karakter==3&&onGround() == true){karakter-=1;
            setImage("p3_walk02.png");}
        if (Greenfoot.isKeyDown("bottem")&&duck==2) {
            setImage("p3_duck.png");
            velocityX = 2;
            duck =3;

        }
        if(Greenfoot.isKeyDown("up")&&duck==3){
            setImage("p3_stand.png");
            duck-=1;
        }
        //==============3=============

        if (Greenfoot.isKeyDown("up")&&onGround() ==true && karakter==4) {
            setImage("p2_jump.png");
            Greenfoot.playSound("jump.mp3");
            
            velocityY = spring;
            karakter=5;   
        }

        if(karakter==5&&onGround() == true){karakter-=1;
            setImage("p2_walk11.png");}
        if (Greenfoot.isKeyDown("down")&&duck==5) {
            setImage("p2_duck.png");
            velocityX = 2;
            duck =6;

        }
        if(Greenfoot.isKeyDown("up")&&duck==6){
            setImage("p2_jump.png");
            duck-=1;
        }
        //============================    
        if (Greenfoot.isKeyDown("left")) {
            velocityX =-3;
        }  if (Greenfoot.isKeyDown("right")) {
            velocityX =3; }

        //============================   
        if (Greenfoot.isKeyDown("left")&& snelheidBlauwKarakter==2) {
            velocityX = -6;

        }
        if (Greenfoot.isKeyDown("right")&& snelheidBlauwKarakter==2) {
            velocityX = 6;
        }
        if (Greenfoot.isKeyDown("left")&& snelheidBlauwKarakter==0) {
            velocityX = -3;
        }  if (Greenfoot.isKeyDown("right")&& snelheidBlauwKarakter==0) {
            velocityX = 3;
        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}

