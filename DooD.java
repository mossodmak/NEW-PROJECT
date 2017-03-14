import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DooD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DooD extends Actor
{
    /**
     * Act - do whatever the DooD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String a;
    String b;
    static int x = 0;
    int gvt[] = {16,8,0,-4,8,-16,-32,-40,-48,-48};
    int dly = 2;
    boolean down;
    boolean check;
    public DooD(){
        check = true;
        down = true;
        a = "DR01.png";
        b = "DL01.png";
        setImage(a);
    }
    public DooD(String aa, String bb){
        check = true;
        down = true;
        a = aa;
        b = bb;
        setImage(a);
    }
    public DooD(String aa, String bb, boolean n){
        down = n;
        a = aa;
        b = bb;
        setImage(a);
    }
    public DooD(String bb){
        down = false;
        b = bb;
        setImage(b);
    }
    public DooD(boolean f){
        down = true;
        a = "DR01.png";
        b = "DL01.png";
        check = f;
        setImage(a);
    }
    public void act() 
    {
        checkKeyPress();
        wormhole();
        if(dly==2){
            gravity();
            if(x!=0){
                x--;
            }
            dly=0;
        }
        dly++;
        /*gravity();
        if(x!=0){
            x--;
        }*/
    }
    public void gravity(){
        if(down==true){
            setLocation(getX(), getY()+gvt[x]);
        }
    }
    public void checkKeyPress(){
        if(check == true){
            if(Greenfoot.isKeyDown("left")){
                setImage(b);
                setLocation(getX()-7,getY());
            }
            if(Greenfoot.isKeyDown("right")){
                setImage(a);
                setLocation(getX()+7,getY());
            }
        }
    }  
    public void wormhole(){
        if(getX()==0){
            setLocation(388, getY());
        }
        if(getX()==389){
            setLocation(1, getY());
        }
    }
    
}
