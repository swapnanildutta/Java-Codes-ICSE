
import java.util.*;
public class Shortform
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string=");
        String str1=sc.nextLine();
        String str=str1.toUpperCase();
        int n=str.length();
        int space=1;
        String result="";
         for(int i=0;i<n;i++)
         {
             char ch=str.charAt(i);
             if(ch==' ')
                 space=space+1;
             else
                 continue;
         }
         for(int j=0;j<=space-1;j++)
         {
             result=result+str.charAt(0);
             str=str.substring(str.indexOf(" ")+1);
         }
        System.out.println(result);
    }
}