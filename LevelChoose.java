import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelChoose here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelChoose extends World
{

    /**
     * Constructor for objects of class LevelChoose.
     * 
     */
    public LevelChoose()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
         this.setBackground("Level3background.jpg");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        SelectLevel selectLevel = new SelectLevel();
        addObject(selectLevel,451,171);

        LevelChoose1 levelChoose1 = new LevelChoose1();
        addObject(levelChoose1,183,416);
        LevelChoose2 levelChoose2 = new LevelChoose2();
        addObject(levelChoose2,372,412);
        LevelChoose3 levelChoose3 = new LevelChoose3();
        addObject(levelChoose3,555,414);
        LevelChoose4 levelChoose4 = new LevelChoose4();
        addObject(levelChoose4,726,416);

    }
}
