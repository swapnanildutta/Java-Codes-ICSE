
import java.util.*;
public class abcd
{
   public static void main()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
        int l=str.length();
        String str1=" ";
        char ch1=' ';
        if(l%2==0)
        {
        int d=l/2;
        str1=str.substring(0,d);
        str=str.replace(str1,"");
    }
    else if(l%2!=0)
    {
        int d=l/2;
        str1=str.substring(0,d);
        str=str.replace(str1,"");
        int l1=str.length();
        ch1=' ';
        if(l1%2!=0)
        {
           ch1=str.charAt(l1-1);
        }
        str=str.replace(ch1,' ');
    }
        str=str.trim();
        String str2=" ",str3=" ";
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
            str2=ch+str2;
        }
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            str3=ch+str3;
        }
        str2=str2.trim();
        str3=str3.trim();
        System.out.println(str2+str3+ch1);
   }
}