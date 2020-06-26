 import java.io.*;
public class stringq11
{


    public static void main(String args[])throws IOException
    {
        String s =" ";String s2=" ";int z=0;int d =0;int len=0;String s3=" ";int c=0;int b=0;int e=0;int f=0;
        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enetr a string");
        s = buff.readLine();
        e= s.length();
        
        
        for(int i=0;i<e;i++){
        if(s.charAt(i)=='a'){
            b=b+1;
        }
           if(s.charAt(i)=='e'){
            c=c+1;
        }
        if(s.charAt(i)=='i'){
            d=d+1;
        }
        if(s.charAt(i)=='o'){
            z=z+1;
        }
        if(s.charAt(i)=='u'){
            f=f+1;
        }
    }
    System.out.println("a"+"\t"+"e"+"\t"+"i"+"\t"+"o"+"\t"+"u");
    System.out.println(b+"\t"+c+"\t"+d+"\t"+z+"\t"+f);
}
}
