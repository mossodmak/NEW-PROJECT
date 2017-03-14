import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class test extends World
{

    /**
     * Constructor for objects of class test.
     * 
     */
    public test()
    {    
        super(390, 600, 1); 
        addObject(new DooD(false), 75, 400);
        addObject(new PlatF(),75,520);
    }
}
