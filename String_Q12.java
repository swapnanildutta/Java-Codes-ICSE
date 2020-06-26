
/**
 * Write a description of class String_Q12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class String_Q12
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
        //str=" "+str;
        String s1=" ";int d=0;String s2=" ";String s4=" ";
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
                 s1 = s1+str.charAt(i);
                 s2 = s2+" "+s1;
                 d = s2.length();
            }
                for(int j=0;j<s2.length();j++){
            char ch=s2.charAt(j);
            if(ch==' ')
            {
                char ch1=s2.charAt(i+1);
                char ch2=Character.toUpperCase(ch1);
                s2=s2.replace(ch1,ch2);
                
                
            }
            s4 = s4+s2;
            s2="";
        }}
        
        System.out.println("New String is "+s4);
    }
}
