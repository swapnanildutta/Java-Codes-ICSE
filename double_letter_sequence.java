import java.util.*;
public class double_letter_sequence
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the sentence=");
       String str1=sc.nextLine();
       String str=str1.toUpperCase()+" ";
       int n=str.length();
       int f=0;
       for(int i=0;i<(n-1);i++)
       {
           if((int)(str.charAt(i))==(int)(str.charAt(i+1)))
                 f=f+1;
           else
                 continue;
       }
       System.out.println(f);
   }
}
