
/**
 * Write a description of class arrayprimer here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.4)
 */
import java.util.*;
public class ascii
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the names?");
        String arr1[]=new String[5];
        int arr2[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<arr1[i].length();j++)
            {
                arr2[i]=arr2[i]+(int)(arr1[i].charAt(j));
            }
        }
        for(int i=0;i<5;i++)
        {
            int ch=arr2[i];
            int tmp=' ';
            for(int j=0;j<5-i-1;j++)
            {
                if(arr2[j]>arr2[j+1])
                {
                    tmp=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=tmp;
                }
            }
        }
        System.out.println("Ascending order of ASCII value ");
        for(int i=0;i<5;i++)
        {
            System.out.println(arr2[i]);
        }
    }
}
