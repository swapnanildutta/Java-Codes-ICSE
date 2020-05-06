
/**
 * Write a description of class bnary_to_deci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class bnary_to_deci
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter?");
        String str=sc.nextLine();
        double sum=0;
        for(int i=0;i<str.length();i++)
        {
            int t = (str.length()-1);  
            t-=i;
            if(str.charAt(i)=='1')
            {
                sum=sum+Math.pow(2,t);
            }
          
        }//cnversion to binary
        int s=(int)(sum);
        int n=s;
        int h=0;
        int c=0;
        while(n>0)
        {
            int a=n%8;
            h=h*10+a;
            n=n/8;
            c++;
        }
        int j=h;
        int b=0;
        for(int i=0;i<=c;i++)
        {
            while(j>0)
            {
                int a=j%10;
                b=b*10+a;
                j=j/10;
            }
            
        }
        System.out.println(b);
    }
}
