
import java.util.*;
public class vowel_last
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence?");
        String str=sc.nextLine();
        str+=" ";
        String str1=" ";
        int f=0,v=0,fv=str.length();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                if(v<=fv)
                {
                    str1=str.substring(f,i);
                    fv=v;
                    v=0;
                }
                f=i;
            }
            else
            {
                if("aeiouAEIOU".indexOf(ch)>=0)
                {
                    v+=1;
                }
            }
        }
        System.out.println("The word is "+str1);
    }
}
