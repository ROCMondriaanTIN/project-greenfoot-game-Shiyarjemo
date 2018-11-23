
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *
 * @author R. Springer
 */
public class Level3 extends World {

    private CollisionEngine ce;
    
    /**
     * Constructor for objects of class MyWorld.
     *
     */
    public Level3() {
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1, false);
        this.setBackground("Level3background.jpg");

        int[][] map = {{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{28,28,28,28,28,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{6,6,6,6,6,6,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1},
{6,6,6,6,6,6,6,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,12,-1,-1,-1},
{6,6,6,6,6,6,6,6,28,-1,-1,14,-1,-1,0,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,28,28,28,28,28},
{6,6,6,6,6,6,6,6,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,14,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,28,6,6,6,6,6,6},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,28,28,28,-1,-1,28,28,28,28,28,-1,-1,28,28,28,28,28,-1,-1,28,28,28,28,28,28,-1,-1,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,-1,-1,-1,-1,-1,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,-1,-1,-1,-1,-1,28,6,6,6,6,6,6,6},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,6,6,6,6,6,6,6,6,6,6,-1,-1,28,28,28,28,-1,-1,6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,28,28,28,28,28,6,6,6,6,6,6,6,6},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
{6,6,6,6,6,6,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},
};

        // Declareren en initialiseren van de TileEngine klasse om de map aan de world toe te voegen
        TileEngine te = new TileEngine(this, 60, 60, map);
        // Declarenre en initialiseren van de camera klasse met de TileEngine klasse 
        // zodat de camera weet welke tiles allemaal moeten meebewegen met de camera
        Camera camera = new Camera(te);
        // Declareren en initialiseren van een main karakter van het spel mijne heet Hero. Deze klasse 
        // moet de klasse Mover extenden voor de camera om te werken
        Hero hero = new Hero();

        // Laat de camera een object volgen. Die moet een Mover instatie zijn of een extentie hiervan.
        camera.follow(hero);

        // Alle objecten toevoegen aan de wereld: camera, main karakter en mogelijke enemies
        addObject(camera, 0, 0);
        addObject(hero, 300, 130);
       
              Music music = new Music();
        addObject(music,61,54);
        music.getClass();
toevoegen();
        // Initialiseren van de CollisionEngine zodat de speler niet door de tile heen kan lopen.
        // De collision engine kijkt alleen naar de tiles die de variabele solid op true hebben staan.
        ce = new CollisionEngine(te, camera);
        // Toevoegen van de mover instantie of een extentie hiervan
        ce.addCollidingMover(hero);
    }
        void toevoegen(){
        
         BlauweKarakter karakter = new BlauweKarakter();
        addObject(karakter,1867,433);
        
        FlyVijand fly = new FlyVijand();
        addObject(fly,2540,360);
        
        Fire fire = new Fire();
        addObject(fire,734,393);

        Fire fire2 = new Fire();
        addObject(fire2,1459,453);
        
          Fire fire3 = new Fire();
        addObject(fire3,1600,453);

        Fire fire4 = new Fire();
        addObject(fire4,3958,453);
                  Fire fire5 = new Fire();
        addObject(fire5,2000,433);

        Fire fire6 = new Fire();
        addObject(fire6,2853,433);
        
                  Fire fire7 = new Fire();
        addObject(fire7,2970,433);

        Fire fire8 = new Fire();
        addObject(fire8,3156,433);
                  Fire fire9 = new Fire();
        addObject(fire9,4205,433);

        Fire fire10 = new Fire();
        addObject(fire10,5147,492);
        
                Fire fire11 = new Fire();
        addObject(fire11,5303,433);
                  Fire fire12 = new Fire();
        addObject(fire12,5364,393);
//====================
 Slime slime1 = new Slime();
        addObject(slime1,988,413);
        Slime slime2 = new Slime();
        addObject(slime2,3540,533);
  
        Slime slime3 = new Slime();
        addObject(slime3,2353,475); 
        
 //====================
         Star star = new Star();
        addObject(star,2508,432);
        Star star2 = new Star();
        addObject(star2,4964,433);

 
 //====================
 Poker poker = new Poker();
 addObject(poker,4417,433);

  Poker poker3 = new Poker();
 addObject(poker3,4841,433);
   Poker poker4 = new Poker();
 addObject(poker4,5547,313);
 
 
  DiamantHud diamantHud = new DiamantHud();
        addObject(diamantHud,166,92);

        AantalSters aantalSters = new AantalSters();
        addObject(aantalSters,185,58);
        Hud_Ster hud_Ster = new Hud_Ster();
        addObject(hud_Ster,146,55);
        HartHud hartHud = new HartHud();
        addObject(hartHud,59,134);
        Hud_Key hud_Key = new Hud_Key();
        addObject(hud_Key,58,189);
       
        
         Deur deur3 = new Deur("door_openMid.png");
        addObject(deur3,5694,333);
        DeurBoven deurBoven = new DeurBoven();
        addObject(deurBoven,5694,263);
   
        }
    @Override
    public void act() {
 
        ce.update();
    }
}