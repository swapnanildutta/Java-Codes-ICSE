import java.io.*;
public class stringq10
{
    public static void main(String args[])throws IOException
    {
        String s =" ";String s2=" ";int d =0;int len=0;String s3=" ";
        BufferedReader buff =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enetr a string");
        s = buff.readLine();
        String s1 = s+" ";
        int e = s1.length();
        for(int i=0;i<e;i++){
        if(s1.charAt(i)!=' '){
            s2=s2+s1.charAt(i);
        }
        else{
            int l = s2.length();
            if(l>len){
                len=l;
                s3 = s2;
    }
    l=0;
    s2="";
    }
}
System.out.println("longest word is:"+s3+"frequency is:"+len);
}
}
        
        