import java.io.*;
public class uniquestring
{ public static void main()throws IOException{
        int s =0;String s1=" ";String str2=" ";String str1=" ";String str3 = " ";String st4=" ";
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
    System.out.println("enter your choice");
    int n = Integer.parseInt(br.readLine());
   
    switch(n){
        case 1:{
         System.out.println("enter a string");
          String str = br.readLine();
        
        
 str1 = " "+str;
  
    int l=str.length();
    
   
    for (int b=0;b<l-1;b++){
        if(str1.charAt(b)==' '){
            str2 = str2+(str1.charAt(b+1));}
      
}
System.out.println(str2);
break;
}
case 2:{
 System.out.println("enter a string");
          String str6 = br.readLine();
        
 str2 = str6+" ";
 int m = str2.length();
for (int j=m-1;j>=0;j--){
     if(str2.charAt(j)==' '){
            str3= str3+(str2.charAt(j-1));}
      
}
System.out.println(str3);
break;}
default:{
System.out.println("wrong choice babua......dant know englis");
    }

}
}
}
