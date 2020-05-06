
import java.util.*;
public class bubblesort1
{
    public static void main(){
    String arr[] = new String[5];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<5;i++){
        System.out.println("enter the names");
        arr[i]=sc.next();
    }
    for(int i=0;i<5-1;i++){
    for(int j=0;j<5-1;j++){
        if(arr[j].compareTo (arr[j+1])>0){
        String t = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=t;
        
        }
    }}
    for(int k=0;k<5;k++){
    
    System.out.println("names are:"+arr[k]);
    }
    
    
    
    }
   
}
