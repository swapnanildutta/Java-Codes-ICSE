
/**
 * Write a description of class first_let here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class first_let
{
    public static void main()
    {
        String str=" Computer Science";
        String str1=" ",str2=" ";
        char arr[]=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            if(ch==' ')
            {
                str2+=str.charAt(i+1);
                i++;
                continue;
            }
            str1=str1+ch;
        }
        str1=str1.trim();
        str2=str2.trim();
        str1+=str2;
        System.out.println(str1);
    }
}
