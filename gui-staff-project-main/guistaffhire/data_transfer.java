
/**
 * Write a description of class data_transfer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class data_transfer extends RecruitmentSystem 
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class data_transfer
     */
    public static void  main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("hi");
        String name = input.nextLine();
        System.out.println("hi"+name);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
