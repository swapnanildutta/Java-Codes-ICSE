
import java.util.*;
public class replace
{
     public static void main()
    {
        
 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
    str=str+" ";
    int len=str.length();
    String word = " ";
   char x;String t=" ";
    for(int i = 0; i<len;i++){
        x = str.charAt(i);
        if(x!=' '){
        word= word+x;
        
    }
    else{
    
       
       
       
       word =word.replaceAll("red","blue")   ;
        
        
      
       t=t+" "+word;
        
   

word="";
}
}

  System.out.println("the  reverse word is:"+t);
}}
