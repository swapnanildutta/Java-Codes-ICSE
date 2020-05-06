
/**
 * Write a description of class arrayprimer here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.4)
 */
import java.util.*;
public class asceding
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings?");
        String arr1[]=new String[5];
        char arr2[]=new char[5];
        String str=" ",str1=" ";
        for(int i=0;i<5;i++)
        {
            arr1[i]=sc.nextLine();
            arr2[i]=arr1[i].charAt(0);
            str1=str1+arr1[i].charAt(0);
        }
        System.out.println("New word is "+str1);
        for(int i=0;i<5;i++)
        {
            char ch=arr2[i];
            char tmp=' ';
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
        System.out.println("The ascending order of the characters are:");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr2[i]);
        }
    }
}

