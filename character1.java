import java.util.*;
public class character1

{
    public static void main(){
    
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the string");
     String n = sc.nextLine();
     int n1=n.length();
     char arr[] = new char[n1];
     for(int i=0;i<n1;i++){
        arr[i]=n.charAt(i);
       // System.out.println(arr[i]);
        }
        char temp=' ';
        for(int i=0;i<n1;i++){
        for(int j=0;j<n1-1;j++){
        if(arr[j]>arr[j+1]){
          temp = arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
       
        
        }
        
    }
}
        for(int i=0;i<n1;i++){
        System.out.print(arr[i]);
        
        }
 
        }        
    }        
            
    
    

