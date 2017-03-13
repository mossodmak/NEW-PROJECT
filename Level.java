import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    String[] Dright = {"DR00.png","DR01.png","DR02.png"};
    String[] Dleft = {"DL00.png","DL01.png","DL02.png"};
    int f = 75;
    public Level()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(390, 600, 1); 
        int f = 50;
        for(int i = 0; i < 3; i++){
            addObject(new DooD(Dright[i], Dleft[i], false), 185, f);
            f+=190;
        }
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Easy easy = new Easy();
        addObject(easy,358,231);
        Normal normal = new Normal();
        addObject(normal,308,422);
        Hard hard = new Hard();
        addObject(hard,339,546);
        easy.setLocation(348,232);
        hard.setLocation(343,599);        
        normal.setLocation(301,411);
    }
}
