import java.util.*;
public class temp
{
    public static void main(){
        Scanner sc =new Scanner(System.in);
        int arr [] =new int[5];
        double arr1[] = new double[5];
        for(int i=0;i<5;i++){
            System.out.println("enter marks i n celsius");
        arr[i]=sc.nextInt();
        
        }
        for(int j=0;j<5;j++){
        double s = ((5.0/9.0)*(arr[j]-32));
        arr1[j]=arr1[j]+s;
        
        }
        for(int k=0;k<5;k++){
        System.out.println(arr[k]+" "+" "+arr1[k]);
        
        }
    
    }
}
