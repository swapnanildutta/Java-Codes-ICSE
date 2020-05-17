
import java.util.*;
public class maximumcharacter
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
        str=str.toLowerCase();
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            arr[i]=str.charAt(i);
        }
        int max=0;char ch=' ';char g=' ';
        for(int i=0;i<str.length();i++)
        {
            char chr=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(chr==arr[j])
                {
                    count+=1;
                   // g=str.charAt(j);
                }
            }
            if(count>max)
            {
                max=count;
               ch=chr;
            }
        }
        System.out.println("The character with maximum number of frequency is "+ch+" frequency is "+max);
    }
}
    