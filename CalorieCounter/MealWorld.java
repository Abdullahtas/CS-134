import greenfoot.*;  
import java.awt.Color; // needed for color
import java.util.Date; // needed for
import java.text.DateFormat; // date and 
import java.text.SimpleDateFormat; // time

/**
 * Write a description of class MealWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MealWorld extends World
{
    private int totalCalories;
    /**
     * Constructor for objects of class MealWorld.
     * 
     */
    public MealWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        printNameAndTime();
        prepareWorldWindow();
        totalCalories = 0;
    }
    public void printNameAndTime()
    {  
        DateFormat dateFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        showText("Abdullah Sabha" + dateFormat.format(date), getWidth() / 3 , 15 );
    }
    public void prepareWorldWindow()
    {  
        // need a Greenfoot Image object to do the work 
        GreenfootImage myImageHelper = getBackground();
        // remember the previous drawing color 
        Color previousColor = myImageHelper.getColor();
        
        // make the drawing color red 
        myImageHelper.setColor(Color.RED);
        // draw the center line 
        myImageHelper.fillRect(getWidth()/2,0,10,getHeight());
        // left half description 
        myImageHelper.drawString("BUFFET", getWidth() / 4 , getHeight() - 30 );
        // could also be used for tight 
        showText("MY PLATE", getWidth()*3 / 4 , getHeight() - 30 );
        
        myImageHelper.setColor(previousColor);
    }
    private void showTotalCalories()
    {  
        showText("Total Calories " + totalCalories, getWidth() - 150, 30);
    }
    public void adjustTotalCalories( int amount )
    {  
        totalCalories = totalCalories + amount;
        showTotalCalories();       // dispaly the updated value 
    }

}
