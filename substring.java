
import java.io.*;
public class substring
{
    public static void main()throws IOException{
        int s =0;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a string");
    String str = br.readLine();
     s = str.length();
    int last =str.lastIndexOf(' ');
    int first = str.indexOf(' ');
    String sur = str.substring(last+1);
    String middle =str.substring(first+1,last);
    String first1 = str.substring(0,first);
    System.out.println(sur+" "+first1+" "+middle);
}
   
}
