
/**
 * Write a description of class prog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prog
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class prog
     */
    public prog()
    {
        // initialise instance variables
        int l = 700;
        int b = 500;
        int p = 0;
        int w = 0;
        System.out.println("The length of the land " + l);
        System.out.println("The breadth of the land " + b);
        p = 2*(l+b);
        w = 4*p;
        System.out.println("The required length of wire is " + w+" m");
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
