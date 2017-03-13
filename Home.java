import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(390, 600, 1); 
        addObject(new DooD(false), 75, 400);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PlatF platf = new PlatF();
        addObject(platf,79,520);
        platf.setLocation(73,521);
        Start start = new Start();
        addObject(start,311,438);
        Doodle doodle = new Doodle();
        addObject(doodle,300,151);
        start.setLocation(299,445);
        start.setLocation(293,488);
        start.setLocation(293,494);
    }
}
