

public class abcde
{
   public static void main(){
    String s ="ABCDE";String k= " ";
    int l = s.length()-2;
    int h=l/2;
    if(l%2==0)
    {
    k = s.substring(0,(l-1));
    
    }
    System.out.println(k);
    }
}
