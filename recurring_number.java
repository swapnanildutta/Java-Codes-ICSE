
/**
 * Write a description of class recurring_number here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class recurring_number
{
    public static void main (double a,double b)
    {
        double c=a/b;
        String str=" ";int n=0,p=0;
        String s=Double.toString(c);
        for (int i=0;i<s.length();i++)
             if(s.charAt(i)=='.')
                 str=s.substring(n=i+1);
        for(int i=0;i<=str.length()-1;i++)
        {
            for(int j=i+1;j<=str.length()-1;j++)
            {
              if(str.charAt(i)==str.charAt(j)&&str.charAt(i+1)==str.charAt(j+1))
              {
                System.out.println("The number "+s.substring(0,n+j)+" is recurring from "+str.substring(i,j));
                p=1;
                break;
              }
            }
            if(p==1)
              break;
        }
    }
}
