
/**
 * Write a description of class arrayprimer here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.4)
 */
import java.util.*;
public class squareroot
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers?");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            double d=Math.sqrt(arr[i]);
            int n=(int)(d);
            if(n*n==arr[i])
            {
                System.out.println(arr[i]+" is a complete squareroot");
            }
        }
    }
}
