import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends World
{

    /**
     * Constructor for objects of class Board.
     * 
     */
    int n = 0;
    String[] st = {"0.png","1.png","2.png","3.png","4.png","5.png","6.png","7.png","8.png","9.png"};
    public Board()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(390, 600, 1); 
        prepare();
    }
    public Board(int y){
        super(390, 600, 1); 
        prepare();
        n = y;
        addObject(new Number(st[n/10000]), 60, 300);
        addObject(new Number(st[n%10000/1000]), 135, 300);
        addObject(new Number(st[n%1000/100]), 210, 300);
        addObject(new Number(st[n%100/10]), 285, 300);
        addObject(new Number(st[n%10]), 360, 300);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Score score = new Score();
        addObject(score,211,115);
        Play play2 = new Play();
        addObject(play2,227,529);
        play2.setLocation(215,528);
    }
}
