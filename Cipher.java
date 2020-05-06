import java.util.*;
public class Cipher
{
    void convert(String str)
    {
        String s=str,r="";char ch;int a;
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            a=(int)(ch);
            if((a>=65&&a<=90))
            {
                if(a>=78)
                  r+=(char)(65+(a-78));
                else
                  r+=(char)(78+(a-65));
            }
            else if((a>=97&&a<=122))
            {
                if(a>=110)
                  r+=(char)(97+(a-110));
                else
                  r+=(char)(110+(a-97));
            }
            else if(ch=='!')
                r+='?';
            else
                r+=ch;
        }
        System.out.println(r);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be converted:");
        String str=sc.nextLine();
        Cipher obj=new Cipher();
        if(str.length()>3)
           obj.convert(str);
        else
           System.out.println("INVALID LENGTH");
    }
}
