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

        LevelChooseIcon levelChoose1 = new LevelChooseIcon("level1.png", new Level1());
        addObject(levelChoose1,183,416);
        LevelChooseIcon levelChoose2 = new LevelChooseIcon("level2.png", new Level2());
        if(Hud_Ster.aantalSter>1){addObject(levelChoose2,372,412);}
        LevelChooseIcon levelChoose3 = new LevelChooseIcon("level3.png", new Level3());
        if(Hud_Ster.aantalSter>3){
            addObject(levelChoose3,555,414);}
        LevelChooseIcon levelChoose4 = new LevelChooseIcon("level4.png", new Level4());
        if(Hud_Ster.aantalSter>5){ addObject(levelChoose4,726,416);}
        LevelChooseIcon levelChoose5 = new LevelChooseIcon("DiamantLevel.png", new BonusLevel());
  if(DiamantHud.diamantHud==1){addObject(levelChoose5,466,562);;
    }
}}
