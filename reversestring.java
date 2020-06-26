import java.util.*;

public class reversestring
{
    public static void main()
    {
        
 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
    str=str+" ";
    int len=str.length();
    String word = " ";
    int ctr= 0; char x;char y=' ';String word1=" ";String h= " ";String s1=" ";
    for(int i = 0; i<len;i++){
        x = str.charAt(i);
        if(x!=' '){
        word= word+x;
        
    }
    else{
      
      //  String s1=" ";
       for(int j=word.length()-1;j>=0;j--){
            y = word.charAt(j);
            s1 = s1+y;
        }
        word="";
        h =h+s1+" ";
     s1="";}}
        System.out.println(h);
       
        
  
}
}

    