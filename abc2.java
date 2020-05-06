
import java.util.*;
public class abc2
{
     public static void main(){
        int b;
        String l=" ";
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string");
    l = sc.nextLine();
    b= l.length();
        for(int i=0;i<=b;i++){
            for(int j=i;j<b;j++){
                System.out.print(l.charAt(j));
            }
            System.out.println();
        }
    }
}

