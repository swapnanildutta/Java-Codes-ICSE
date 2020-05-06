
public class fibprime
{
    public static void main(int n){
    int f1,f2,f3;
  f2 =0;
   f3=1;
   System.out.println(f3);
  while(n>1){
      f1=f2;
      f2=f3;
      f3=f1+f2;
    //   System.out.println(f3);
    int v=f3;int c=0;
    for(int i=1;i<=v;i++){
            if(v%i==0){
            c=c+1;
            }}
            if(c==2){
                System.out.println("the prime number is"+v);
       n=n-1;
    }
    
}
}
}
