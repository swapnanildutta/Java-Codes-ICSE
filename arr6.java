
import java.util.*;
public class arr6
{
    public static void main(){
         int arr[] = new int[5];
    Scanner sc =new Scanner(System.in);
   
    System.out.println("enter the numbers");
    for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<arr.length-1;i++){
  int  m=arr[i]+1;
    if(m==arr[i+1]){
    
    System.out.print("consecutive nos are"+arr[i]+" "+"AND"+" ");
    System.out.println(arr[i+1]);
    }
   
    
    }
    }
    }

