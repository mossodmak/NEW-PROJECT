import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bax here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bax extends Actor
{
    /**
     * Act - do whatever the Bax wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Home());
            Greenfoot.playSound("button-6.wav");
        }
        
    }    
}
