
public class repeat
{
    public static void main(){
  String s ="application";
  int l = s.length();String p=" ";
  for(int i=65;i<=90;i++){
      for(int j=0;j<l;j++){
          char x = s.charAt(j);
          if(x==(char)i||x==(char)(i+32))
          p=p+x;
         
        }
    }
     System.out.print(p);
     p =p+" ";
     int f = p.length();
     String ans =" ";
     char ch1,ch2;
     for(int i=0;i<f-1;i++){
         ch1 = p.charAt(i);
         ch2=p.charAt(i+1);
         if(ch1!=ch2){
            ans=ans+ch1;
            }
         
    }
    System.out.println(ans);
}
}
