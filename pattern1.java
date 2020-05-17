import java.io.*;
public class pattern1
{
    
    public static void main()throws IOException{
      int a,b;
      InputStreamReader read = new InputStreamReader(System.in);
      BufferedReader in = new BufferedReader(read);
      System.out.println("Enter a number");
      a= Integer.parseInt(in.readLine());
      b= a*a;
      System.out.println(b);
    }
}
