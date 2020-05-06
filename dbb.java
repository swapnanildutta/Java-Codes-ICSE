import java.util.Scanner;
public class dbb
{
 public static void main(String args[])
 {
     Scanner sc =new Scanner (System.in);
     System.out.println("enter a  String");
     String s=sc.next();
     char ch=' ';
     String ans=" ";
     for(int i=0;i<s.length();i++)
     {
         ch=s.charAt(i);
         if (ch!=' ')
         {
             ans=ans+ch;
             s=s.replace(ch,' ');
         }
     }
            System.out.println(ans);
 }
}
     