
/**
 * Write a description of class abc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class abc
{
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            int a=65;
            for(int j=1;j<=5-(i-1);j++)
            {
                System.out.print((char)(a+(j-1)));
            }
            for(int k=0;k<=i-2;k++)
            {
                System.out.print((char)(a+k));
            }
            System.out.println();
        }
    }
}
