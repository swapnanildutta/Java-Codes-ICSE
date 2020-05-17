
import java.util.*;
public class pattern12
{
    public static void main(){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string?");
        String str=sc.nextLine();
        int l = str.length();
        for(int i=l;i>1;i--){
            for(int j=l;j>i;j-- ){
 
            System.out.print(str.charAt(i));
        }
        System.out.println();
}
}
}
