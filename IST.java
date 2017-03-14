import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IST here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IST extends World
{

    /**
     * Constructor for objects of class IST.
     * 
     */
    public IST()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(390, 600, 1); 
        addObject(new DooD(false), 185, 440);
        addObject(new PlatF(), 185, 520);
        addObject(new DooD("DR01.png"), 250, 75);
        addObject(new DooD("DL01.png"), 125, 75);
        
        addObject(new LL(), 128, 141);
        addObject(new RR(), 247, 141);
        addObject(new Move(), 188, 210);
        addObject(new Bax(), 88, 291);
        addObject(new Auto(), 201, 561);
    }
}
