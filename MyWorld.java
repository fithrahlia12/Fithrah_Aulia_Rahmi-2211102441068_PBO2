import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class langit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class langit.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Random rnd = new Random();
        Boolean isRunning = false;
        for (int i=0; i<10; i++){
            int x = rnd.nextInt(this.getWidth()-1);
            int y = rnd.nextInt(this.getHeight()-1);
            awan awan1 = new awan();
            awan1.setRotation(75*rnd.nextInt(1));
            this.addObject(awan1, x, y);
        }
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bird bird = new bird();
        addObject(bird,120,272);
    }
}