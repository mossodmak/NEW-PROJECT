import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int j = 34;
    int f = 550;
    int[] length = {80, 100, 120};
    int[] number = {7, 6, 5};
    String[] Dright = {"DR00.png","DR01.png","DR02.png"};
    String[] Dleft = {"DL00.png","DL01.png","DL02.png"};
    int q;
    public MyWorld(int n){
        super(390, 600, 1);
        addObject(new BG(), 265, 175);
        q = n;
        addObject(new DooD(Dright[q], Dleft[q]), 99, 490);
        for(int i = 0; i < 6; i++){
            addObject(new PlatF(false), j, 585);
            j += 64;
        }
        prepare();
        Objective.score = 0;
        showText("Score : "+Objective.score, 70, 20);
    }
    public void act(){
        showText("Score : "+Objective.score, 70, 20);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        for(int i = 0; i < number[q]; i++){
            addObject(new PlatF(),34+Greenfoot.getRandomNumber(322),f);
            f-=length[q];
        }
    }
}
