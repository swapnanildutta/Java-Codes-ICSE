
public class am
{
   public static void main(){
       String s = "i am in amsterdam ";String l=" ";int p=0;char m=' ';String w = " ";
       String str = "i am in amsterdam";
       int e=0;int q=0;
       int d= s.length();
       w=w+" ";
       q=w.length();
       int ctr= 0; char x;char y=' ';String word1=" ";String h= "am";String s1=" ";
         
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
