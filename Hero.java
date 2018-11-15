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
    int spring = -16;
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
        
        velocityX *= drag;
        velocityY += acc;
        if (velocityY > gravity) {
            velocityY = gravity;
        }
        applyVelocity();

        for (Actor poker : getIntersectingObjects(poker.class)) {
            if (poker != null) {
                getWorld().removeObject(this);
                break;
            }
        }
        
        
     for (Actor star : getIntersectingObjects(star.class)) {
            if (star != null) {
                Greenfoot.playSound("colect.mp3");
                getWorld().removeObject(star);
                this.star +=1;
                break;
            }
        }
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

  