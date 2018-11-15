import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    public int star = 0;
    int spring = -18;
    public Hero() {
        super();
        gravity = 9.8;
        acc = 0.6;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        handleInput();
                applyVelocity();
      
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }

                          for (Actor Poker : getIntersectingObjects(Poker.class)) {
            if (Poker != null) {
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
                this.star +=1;
                return;
               
            }}
        //=========================//


 
    }
        

    
 boolean onGround(){Actor under = getOneObjectAtOffset(0,getImage().getHeight()/2, Tile.class);
return under != null;}

        


            

             
    public void handleInput() {
        if (Greenfoot.isKeyDown("space")&&onGround() == true) {
            velocityY = -10;
           
            velocityY = spring;
            Greenfoot.playSound("jump.mp3");
        }

        if (Greenfoot.isKeyDown("left")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("right")) {
            velocityX = 2;
            
        }
    
 
        if (Greenfoot.isKeyDown("w")&&onGround() == true) {
            velocityY = -10;
            velocityY = spring;
          
           
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
            
            
        }
    }
    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }}

  