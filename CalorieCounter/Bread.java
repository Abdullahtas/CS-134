import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bread here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bread extends GenericFoodItem
{
    /**
     * Act - do whatever the Bread wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bread() 
    {
        super();
        caloriesForItem = 210;
    }    
    public void act()
    { 
        super.act();
        if ( inLeftHalf )
        {  
            turn(10);
        }
    }
}
