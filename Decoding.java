import java.util.*;
/*input:2312179862310199501872379231018117927
 */
public class Decoding
{
   String reverse(String str)
   {
      String original=str, reverse = "";
      int length = original.length();
      for ( int i=length-1;i>=0;i--)
         reverse = reverse + original.charAt(i);
      return reverse;
   }
   void decode(String str)
   {
       String code=str,code1=str,decoded="";
       int l=0,val,c;
       while(code1.length()!=0)
       {
           c=Integer.parseInt(code1.substring(0,2));
           if(c==32||(c>=65&&c<=90)||(c>=97&&c<=99))
           {
               l=2;
               val=Integer.parseInt(code1.substring(0,2));
               decoded=decoded+(char)(val);
               code1=code1.substring(l);
           }
           else
           {
               l=3;
               val=Integer.parseInt(code1.substring(0,3));
               decoded=decoded+(char)(val);
               code1=code1.substring(l);
           }
       }
       System.out.println("Output:"+decoded);
   }
   void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the code to be decoded:");
       String str=sc.next();
       Decoding ob=new Decoding();
       String rev=ob.reverse(str);
       ob.decode(rev);
       //System.out.println(rev);
   }
}

