import java.io.*;
public class initials
{
     public static void main()throws IOException{
        int s =0;String s1=" ";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a string");
    String str = br.readLine();
    String str1 = " "+str;
     s = str1.length();
     for(int i=0;i<s;i++){
         char b = str1.charAt(i);
         if(b==' '){
             s1 = s1+str1.charAt(i+1)+".";
            }}
            System.out.println(s1);
        }
}
