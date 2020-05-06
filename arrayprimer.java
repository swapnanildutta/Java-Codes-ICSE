
/**
 * Write a description of class arrayprimer here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.4)
 */
import java.util.*;
public class arrayprimer
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
            int c=0;
            for(int j=2;j<=arr[i];j++)
            {
                if(arr[i]%j==0)
                {
                    c++;
                }
            }
            if(c==1)
            {
                System.out.println(arr[i]+" is a prime number");
            }
        }
    }
}

