
       import java.util.*;
public class er
{
   public static void main(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
        System.out.println("Enter the word to be searched");
        String h=sc.nextLine();
       String s = str;String l=" ";int p=0;char m=' ';String w = " ";
       String s8 = str;
       int e=0;int q=0;
       int d= s.length();
       w=w+" ";
       q=w.length();
       int ctr= 0; char x;char y=' ';String word1=" ";String s1=" ";
         
    str=str+" ";
    int len=str.length();
    String word = " ";
    for(int i = 0; i<len;i++){
        x = str.charAt(i);
        if(x!=' '){
        word= word+x;
        
    }
    else{
      
     
    
       if(word.compareTo(h)==0){p=p+1;}
        word="";
        }
    }
       
           for(int i=0;i<d;i++){
        if((s.charAt(i)=='a')&&(s.charAt(i+1)=='m')){
        e =e+1;
        }
       
        }
        System.out.println("no of am word is"+" "+p);
         System.out.println("occurence of am is:"+" "+e);
}
}
