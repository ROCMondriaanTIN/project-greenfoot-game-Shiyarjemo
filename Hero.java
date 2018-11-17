import greenfoot.*;

public class Hero extends Mover {

    private  double gravity;
    private  double acc;
    private  double drag;

    int spring = -18;
    int karakter = 0;
    int loop = 0;
    int duck = 0;
    public int keyYellow = 0;

    public Hero() {
        super();
        gravity = 5.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    public void yellowKey(){               
        for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
                getWorld().removeObject(Key);
                keyYellow =1;

                Greenfoot.playSound("colect.mp3");
                return;

            }}
        for (Actor LockYellow  : getIntersectingObjects(LockYellow.class)) {
            if (LockYellow != null&&keyYellow==1) {

                this.setLocation(5600, 253);

                return;}}}

    @Override
    public void act() {
        yellowKey();
        handleInput();
        applyVelocity();
        rozeKarakter();
        blauweKarakter();
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        for (Actor Diamant : getIntersectingObjects(Diamant.class)) {
            if (Diamant != null) {
                Greenfoot.setWorld(new LevelChoose());
                return;
            }}
        for (Actor Poker : getIntersectingObjects(Poker.class)) {
            if (Poker != null) {
               getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                return;

            }}
        for (Actor Fire : getIntersectingObjects(Fire.class)) {
            if (Fire != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                return;

            }}
        for (Actor FlyVijand : getIntersectingObjects(FlyVijand.class)) {
            if (FlyVijand != null) {
                getWorld().removeObject(this);
                Greenfoot.setWorld(new GameOver());
                return;

            }}
        for (Actor Slime  : getIntersectingObjects(Slime.class)) {
            if (Slime != null) {
            Greenfoot.setWorld(new GameOver());
            getWorld().removeObject(this);

                return;}}

        for (Actor Star : getIntersectingObjects(Star.class)) {
            if (Star != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Star);
                this.star +=1;
                return;
            }}

        for (Actor Water : getIntersectingObjects(Water.class)) {
            if (Water != null) {
                Greenfoot.setWorld(new GameOver());
                getWorld().removeObject(this);
                return;

            }}
        for (Actor Door : getIntersectingObjects(Door.class)) {
            if (Door != null && star==2) {  
                Greenfoot.playSound("deurOpen.mp3");
                Greenfoot.setWorld(new Level2()); 
                return;

            }}
        for (Actor DoorLevel2 : getIntersectingObjects(DoorLevel2.class)) {
            if (DoorLevel2 != null && star==2) {  
                Greenfoot.playSound("deurOpen.mp3");
                Greenfoot.setWorld(new Level3()); 
                return;
            }}
    }

    public void rozeKarakter(){  
        for (Actor RozeKarakter : getIntersectingObjects(RozeKarakter.class)) {
            if (RozeKarakter != null) {
                getWorld().removeObject(RozeKarakter);  
                Greenfoot.playSound("muntKarakter.mp3");
                setImage("p3_stand.png");
                karakter =2;
                duck = 3;
                spring = -14;
                gravity = 4.8;
                return;
            }
        }
    }

    public void blauweKarakter(){  
        for (Actor BlauweKarakter : getIntersectingObjects(BlauweKarakter.class)) {
            if (BlauweKarakter != null) {
                getWorld().removeObject(BlauweKarakter);  
                Greenfoot.playSound("muntKarakter.mp3");
                setImage("p2_walk11.png");
                karakter =4;
                duck =5;
                spring =-20;
                gravity =5.5;
                this.drag =0.9;
                return;
            }
        }
    }

    boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
        return under != null;}

    public void handleInput() {
        if (Greenfoot.isKeyDown("w")&&onGround() == true && karakter==0) {
            setImage("p1_jump.png");
            Greenfoot.playSound("jump.mp3");
            velocityY = -10;
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
        //==========2=============

        if (Greenfoot.isKeyDown("w")&&onGround() == true && karakter==2) {
            setImage("p3_jump.png");
            Greenfoot.playSound("jump.mp3");
            velocityY = -10;
            velocityY = spring;
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
            velocityY = -10;
            velocityY = spring;
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
        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        }  if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
        }

    }
    void key(){
        for (Actor Key : getIntersectingObjects(Key.class)) {
            if (Key != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(Key);
                this.setLocation(300,200);
                this.keyYellow +=1;
                return;
            }}
    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}

