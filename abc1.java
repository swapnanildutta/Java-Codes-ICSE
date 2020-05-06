
import java.util.*;
public class abc1
{
    
    
    public static void main(){
        int b;
        String l=" ";
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string");
    l = sc.nextLine();
    b= l.length();
        for(int i=b;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print(l.charAt(j));
            }
            System.out.println();
        }

}
}
