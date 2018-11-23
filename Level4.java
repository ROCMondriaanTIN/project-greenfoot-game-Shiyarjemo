import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
{
    private CollisionEngine ce;
    /**
     * Constructor for objects of class Level4.
     * 
     */
    public Level4()
    {    
        super(800, 360, 1, false);
        this.setBackground("SoonComing.png");

        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen

        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera

        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 

        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
       
    }
}
