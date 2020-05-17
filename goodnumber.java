
public class goodnumber
{
    public static void main(){
    int a =22;
    int b =22;
    int c=a+b;
    int d = a*b;
    int e =Math.abs(c-d);
    if (e>10){
    int f = e%10;
    int g = e/10;
    int l = f+g;
    
    int m=l%10;
    int n = l/10;
    int k =m+n;
    if(k==1){
    System.out.println("good number");
    
    }
    else{
        System.out.println("not a food number");
    }
    }
    
    }}
    