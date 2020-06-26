import java.util.*;
public class Repeatation_removal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        str=str.toUpperCase();
        str+=" ";
        for(int i=0;i<str.length()-1;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
                continue;
            else
                System.out.print(str.charAt(i));
        }
    }
}
