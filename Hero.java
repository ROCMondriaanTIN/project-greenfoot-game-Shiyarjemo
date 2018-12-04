import greenfoot.*;

public class Hero extends Mover {
    public boolean left=true;
    public boolean mirror=true;
    private  double gravity;
    private  double acc;
    private  double drag;
    public int frame;
    int spring = -16;
    int karakter = 0;
    int loop = 0;
    int duck = 0;
    int karakterKleur=1;
    public int keyYellow =0;

    public Hero() {

        super();
        gravity = 4.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");

    }

    public void Enemy(){

        switch(frame){
            case 1:
            setImage("p1_walk01.png");
            break;
            case 2:
            setImage("p1_walk02.png");
            break;
            case 3:
            setImage("p1_walk03.png");
            break;
            case 4:
            setImage("p1_walk04.png");
            break;
            case 5 :
            setImage("p1_walk05.png");
            case 6 :
            setImage("p1_walk06.png");
            break;
            case 7:
            setImage("p1_walk07.png");
            break;
            case 8 :
            setImage("p1_walk08.png");
            case 9 :
            setImage("p1_walk09.png");
            break;
            case 10:
            setImage("p1_walk10.png");
            break;
            case 11:
            setImage("p1_walk11.png");

            frame=0;
            break;   
        }
        frame++;
        mirrorImage();}

    public void EnemyBlauwe(){

        switch(frame){
            case 1:
            setImage("p2_walk01.png");
            break;
            case 2:
            setImage("p2_walk02.png");
            break;
            case 3:
            setImage("p2_walk03.png");
            break;
            case 4:
            setImage("p2_walk04.png");
            break;
            case 5 :
            setImage("p2_walk05.png");
            case 6 :
            setImage("p2_walk06.png");
            break;
            case 7:
            setImage("p2_walk07.png");
            break;
            case 8 :
            setImage("p2_walk08.png");
            case 9 :
            setImage("p2_walk09.png");
            break;
            case 10:
            setImage("p2_walk10.png");
            break;
            case 11:
            setImage("p2_walk11.png");

            frame=0;
            break;   
        }
        frame++;
        mirrorImage();}

    public void EnemyRoze(){

        switch(frame){
            case 1:
            setImage("p3_walk01.png");
            break;
            case 2:
            setImage("p3_walk02.png");
            break;
            case 3:
            setImage("p3_walk03.png");
            break;
            case 4:
            setImage("p3_walk04.png");
            break;
            case 5 :
            setImage("p3_walk05.png");
            case 6 :
            setImage("p3_walk06.png");
            break;
            case 7:
            setImage("p3_walk07.png");
            break;
            case 8 :
            setImage("p3_walk08.png");
            case 9 :
            setImage("p3_walk09.png");
            break;
            case 10:
            setImage("p3_walk10.png");
            break;
            case 11:
            setImage("p3_walk11.png");

            frame=0;
            break;   
        }
        frame++;
        mirrorImage();}

    public void mirrorImage(){
        if (mirror && left){ 
            getImage().mirrorHorizontally();
        }
        else if (!mirror && left){
            getImage().mirrorHorizontally();
        }
    }

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
        if(isTouching(Snail.class)||isTouching(Poker.class)||
        isTouching(Slime.class)||isTouching(Fire.class)
        ||isTouching(FlyVijand.class)||isTouching(Water.class)){Hud_Key.hudKey=0;

            Hud_Ster.aantalSter =0;
            DiamantHud.diamantHud=0;
            Diamant.diamant=0;
            getWorld().removeObject(this);
            Greenfoot.setWorld(new GameOver());

                
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
                karakterKleur=2;
                duck = 3;
                spring = -11;
                gravity =5.5;
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
                karakterKleur=3;

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

        if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& karakterKleur==1) {

            velocityX = -4;  
            left=true;
            Enemy();
        }  if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& karakterKleur==1) {
            velocityX = 4;
            Enemy();
            left=false;
        }
        if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&& karakterKleur==2) {

            velocityX = -2;  
            left=true;
            EnemyRoze();
        }  if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& karakterKleur==2) {
            velocityX = 2;
            EnemyRoze();
            left=false;
        }
        if ((Greenfoot.isKeyDown("left")||Greenfoot.isKeyDown("a"))&&karakterKleur==3) {
            velocityX = -5;
            left=true;
            EnemyBlauwe();
        }
        if ((Greenfoot.isKeyDown("right")||Greenfoot.isKeyDown("d"))&& karakterKleur==3) {
            velocityX = 5;
            EnemyBlauwe();
            left=false;

        }
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}