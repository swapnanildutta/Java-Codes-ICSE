
import java.io.*;
public class palprime{
   int pal(int l){
        int reverse =0;
        while(l!=0){
        reverse = reverse*10+(l%10);
        l = l/10;
        }
        return reverse;
        }
        public int prime(int m){
            int c=0;int flag=0;
        for(int i=1;i<=m;i++){
            if(m%i==0){
            c=c+1;
            }}
            if(c==2){
                
         flag =1;
        
        
        }
         return flag;
    }

    public static void main()throws IOException{
    int n;
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a number");
        n = Integer.parseInt(buf.readLine());
        palprime ob = new palprime();
        if((n==ob.pal(n)&&(1==ob.prime(n)))){
      System.out.println(  "correct");
    }else{System.out.println(  "not correct");}
      ob.prime(n);
      
      
    }
    }

