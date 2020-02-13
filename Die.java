 


/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int die;
    
    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        die = roll();
    }

    /**
     * This method rolls the die
     *
     * @return    die
     */
    public int roll()
    {
        // put your code here
        die = (int) (Math.random()*6 +1);
        return die;
    }
    
    /**
     * This method shows the player the value of their roll
     *
     * @return    die
     */
    public int getResult()
    {
        // put your code here
        return die;
    }
}
