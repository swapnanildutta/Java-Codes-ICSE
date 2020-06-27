import java.util.*;
public class Surname_First
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name of three words=");
        String str1=sc.nextLine();
        String str=str1.toUpperCase();
        int n=str.length();
        int s=str.lastIndexOf(' ');
        System.out.println(str.substring(s,n)+" "+str.substring(0,s));
    }
}
