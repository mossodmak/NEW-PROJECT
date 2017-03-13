import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Objective here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Objective extends Actor
{
    /**
     * Act - do whatever the Objective wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score = 0;
    public void act() 
    {
        // Add your action code here.
    }    
    public void checkFrame(){
        try{
        DooD m = getWorld().getObjects(DooD.class).get(0);
        //PlatF s = getWorld().getObjects(PlatF.class).get(0);
        if(m.getY()<=160 && m.gvt[m.x]<0){
            setLocation(getX(),getY()-m.gvt[m.x]);
            score-=m.gvt[m.x]/20;
        }
        if(m.getY()==599){
            Greenfoot.setWorld(new Board(score));
            getWorld().removeObject(m);
            score = 0;
            Greenfoot.playSound("smb_mariodie.wav");
        }
        /**if(s.getY()<=195&&s.getY()>=186){
            getWorld().addObject(new PlatF(),34+Greenfoot.getRandomNumber(322),s.getY()-185);
        }*/
    }
    catch(IndexOutOfBoundsException e){
    }
    }
}
