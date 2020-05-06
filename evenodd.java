
 import java.util.*;
public class evenodd
{
   
   public static void main(String args[])
    {
        int s =0;int s1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers?");
        int arr[]=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if(arr[i]%2==0)       {
             s =s+arr[i];
                
            }     
            else{
             s1 =s1+arr[i];
            }}
            
                System.out.println("sum of even number="+s);
                 System.out.println("sum of odd number="+s1);
                
            }
        }
    

