import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlatF here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlatF extends Objective
{
    boolean rs;
    public PlatF(){
        rs = true;
    }
    public PlatF(boolean f){
        rs = f;
    }
    public void act() 
    {
        checkJump();
        checkFrame();
        reSpawn();
    }
    public void checkJump(){
        try{
        DooD m = getWorld().getObjects(DooD.class).get(0);
        //if(m.get)
        if(isTouching(DooD.class) && m.x<=2 && ((-45)<=(m.getX()-this.getX())&&(m.getX()-this.getX())<=45) && (this.getY()-m.getY())>=30){
            try{
                if(m.getY()<=this.getY()){
                    m.x = 9;
                    Greenfoot.playSound("smb_jump-super.wav");
                }
            }
            catch(IllegalStateException e){
            }
        }
        
        if(m.x<0){
            m.x--;
        }
    }
        
    
    catch(IndexOutOfBoundsException e){
        }
    }
    public void reSpawn(){
        try{
            if(getY()==599 && rs==true){
                getWorld().addObject(new PlatF(),34+Greenfoot.getRandomNumber(322),1);
                getWorld().removeObject(this);
            }
            if(getY()==599){
                getWorld().removeObject(this);
            }
        }
        catch(IllegalStateException e){
        }
    }
}
