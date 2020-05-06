import java.util.*;
public class Array_Exists
{
   public static void main(String args[])
   {
       int a[]={10,20,30,40,50,60,70,80,90,100};
       int i ,  , n ;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number to check  :  ");
         n=sc.nextInt();
             for(i=0;i<10;i++)
               {
                   if(a[i]==n)
                        o=1;
                   else
                        o=0;
               } 
         if (o==1)
              System.out.println("The number exists in the array");
         else
              System.out.println("The numer dones not exixts in the array");
   }    
}
