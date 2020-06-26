
/**
 * Write a description of class pi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.math.BigInteger;
public class pi
{
   public static void main (double a,double b)
    {
        try{
        double c=a/b;
        String str=" ";int n=0,p=0;
        String s=Double.toString(c);
        for(int i=0;i<s.length();i++)
             if(s.charAt(i)=='.')
                 str=s.substring(n=i+1);
        for(int i=0;i<=str.length()-1;i++)
        {
            for(int j=i+1;j<=str.length()-1;j++)
            {
              if(str.charAt(i)==str.charAt(j)&&str.charAt(i+1)==str.charAt(j+1))
              {
                System.out.println("The number "+s.substring(0,n+j)+" is recurring after "+str.substring(i,j));
                p=1;
                break;
              }
            }
            if(p==1)
              break;
        }
       }
        catch(StringIndexOutOfBoundsException e) {
            //BigInteger x = new BigInteger(Double.toString(a));
            //BigInteger y = new BigInteger(Double.toString(b));
            BigInteger c = new BigInteger(Double.toString(a/b)); 
            /*BigInteger bi2 = new BigInteger("3039768898793547264523745379249934"); 

            BigInteger bigSum = bi1.add(bi2);

            BigInteger bigProduct = bi1.multiply(bi2);

            System.out.println("Sum : " + bigSum);
              System.out.println("Product : " + bigProduct);*/
           System.out.println("The number "+c+" is not recurring");
       }
    }
}
