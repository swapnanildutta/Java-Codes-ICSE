import java.io.*;
public class voweltoconsonant
{
    public static void main(String args[])throws IOException
    {
InputStreamReader read =new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the sentence?");
String str1=" ";
        String str=in.readLine();
        int i = str.length();
        for(int j=0; j<=i-1;j++){
        char ch1 = str.charAt(j);
        if((ch1 == 'a')||(ch1=='e')||(ch1=='i')||(ch1=='o')||(ch1=='u')){
        int l = (int)(ch1);
        int g = l+1;
        char ch = (char)g;
        str1 = str1+ch;
        
        }
        else{
        int l = (int)(ch1);
        int g = l-1;
        char ch = (char)g;
        str1 = str1+ch;
        //str1 = str1+ch1;
        }
       
        }
        str1=str1.trim();
         System.out.println(str1);
}
}

