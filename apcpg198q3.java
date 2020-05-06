import java.io.*;
class apcpg198q3
{
    public static void main ()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name;
        int up,low,digit;int p;
        char chr;
        System.out.println("enter the string");
        name=br.readLine();
        p=name.length();
        for(int i=0;i<p;i++)
        {
            chr=name.charAt(i);
            if(chr>='A' && chr<='Z'){
            System.out.println("capital");
            }
            else if(chr>='a' && chr<='z')    {
                System.out.println("small");
            }
          else if(chr>='0'&& chr<='9')
            {
                System.out.println("digit");
            }
            else
            {
                System.out.println("special character");
            }
            
                
        }
    }}