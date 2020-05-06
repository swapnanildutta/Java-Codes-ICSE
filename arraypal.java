import java.util.*;
public class arraypal
{
   public static void main(){
    int number=0;
    int reverse =0;
    int numcopy=0;
    Scanner scan= new Scanner(System.in);
    System.out.println("enter how many number in the array");
    int num = scan.nextInt();
    System.out.println("enter the elements");
    numcopy = num;
    int[]array = new int[num];
    for(int i=0;i<num;i++){
    
    array[i]=scan.nextInt();
    int digit=numcopy%10;
    numcopy=numcopy/10;
    reverse=(reverse*10)+digit;
    if (num==reverse){
     System.out.println("palin");
    
    }
    else{ System.out.println("not");}
    
    }
    }
}
