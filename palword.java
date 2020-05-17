import java.io.*;
public class palword
{
   
            
     public static void main()throws IOException{
        int s =0;String s1=" ";String str2=" ";String str1=" ";String str3 = " ";String st4=" ";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter a string");
    String str = br.readLine();
    str1=str+" ";int v=0;
    int b = str1.length();
    char ch;char ch1;
    for(int i=0;i<b;i++){
         ch = str1.charAt(i);
        if(ch!=' '){
            str2=str2+ch;
           
           
        }
           
        else {
             str3 =str2.trim();
           
 int c = str3.length();
 
 int j=0;
 for(j=c-1;j>=0;j--){
     ch1 = str3.charAt(j);
     s1=s1+ch1;
     st4 = s1.trim();
     

 
    }
    
    
    if(str3.compareTo (st4)==0){
        v=v+1;
        System.out.println("palindrome words are:"+st4);
        
       
        }
        s1="";
    st4="";

        str2="";
        }
    
    }
    System.out.println("frequency"+v);
    }          
    }    