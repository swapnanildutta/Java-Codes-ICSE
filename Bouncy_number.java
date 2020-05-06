import java.util.*;
public class Bouncy_number
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number to be checked:");
       int n=sc.nextInt();
       String str=String.valueOf(n);
       int p=0,q=0;
       for(int i=0;i<str.length()-1;i++)
       {
          if(str.charAt(i)>str.charAt(i+1))
          {
              p=1;
              break;
          }
       }
       for(int i=0;i<str.length()-1;i++)
       {
          if(str.charAt(i)<str.charAt(i+1))
          {
              q=1;
              break;
          }
       }
       if(p==1&&q==1)
             System.out.println("It is a Bouncy Number");
       else
             System.out.println("It is not a Bouncy Number");
   }
}
