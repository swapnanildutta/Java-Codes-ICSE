import java.io.*;
public class pattern
{
     public static void main()throws IOException{
        BufferedReader buf = new BufferedReader (new InputStreamReader(System.in));
         System.out.println("enter a string");
        String s = buf.readLine();
        int n =s.length();
        for(int i=n;i>=0;i--){
            for(int j=n;j>i;j--){
                System.out.print(s.charAt(i));
            }
            System.out.println();
            
}
}
}
