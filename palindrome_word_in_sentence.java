
import java.util.*;
public class palindrome_word_in_sentence
{
   public static void main(String agrs[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a String=");
       String str=sc.nextLine();
       int n=str.length();
       for(int i=0;i<n;i++)
       {
           int a=str.indexOf(" ");
           for(int j=0;j<a;j++)
           {
              String reverse="";
              String word=str.substring(0,a);
              int b=word.length();
              for(int k=0;k<a;k++)
                    reverse=reverse+word.charAt(a);
                if(reverse.equalsIgnoreCase(word)==true)
                       System.out.println(word);
                else
                      continue;
           }
           str=str.substring(a);
       }
   }
}
