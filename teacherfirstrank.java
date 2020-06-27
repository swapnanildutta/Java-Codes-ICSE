import java.util.*;
public class teacherfirstrank
{
    public static void main(){
    Scanner sc=new Scanner(System.in);
        int i,j,k=0,min,minposition=0;
        
        String m[]=new String[3];
         int n[]=new int[3];
         for( i=0;i<=2;i++){
            System.out.println("enter the name and marks");
            m[i] = sc.next();
            n[i]=sc.nextInt();
           


            
            
            
            }
            String str=m[0];
            String str1=" ";
            int tmp=0;
            for( i=0;i<2;i++)
            {
                for(j=0;j<2-1;j++)
                {
                if(n[j]<n[j+1])
                {
                    str1=m[j];
                    m[j]=m[j+1];
                    m[j+1]=str1;
                    
                    tmp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=tmp;
                }
            }
            }
            System.out.println("number with marks");
            for(i=0;i<=2;i++){
            System.out.println(n[i]+m[i]);
            }
        }        
    }        
            
    
    
