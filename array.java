import java.io.*;
class array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String m[]=new String[10];
        System.out.println("Enter 10 names?");
        for(int i=0;i<10;i++)
        {
            m[i]=br.readLine();
        }
        for(int i=0;i<10;i++)
        {
            String a=m[i];
            a=a.toUpperCase();
            char ch1=a.charAt(0);
            char ch2=a.charAt(a.length()-1);
            if((ch1=='A')&&(ch2=='A'))
            {
                System.out.println("The required string is "+m[i]);
            }
        }
    }
}