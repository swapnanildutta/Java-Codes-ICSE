
import java.util.*;
public class highest
{
   
    public static void main(String args[])
    {
        int maxpos=0;int f=0;int g=0;
        Scanner sc=new Scanner(System.in);
       
        int arr[]=new int[3];
           
        String name[]=new String[3];
        int science[]=new int[3];
        int math[] =new int[3];
        for(int i=0;i<3-1;i++)
        {
             System.out.println("Enter the name?");
             name[i]=sc.next();
              System.out.println("Enter the hist");
            arr[i]=sc.nextInt();
             System.out.println("Enter the maths?");
            math[i]=sc.nextInt();
             System.out.println("Enter the science marks?");
            science[i]=sc.nextInt();
           
        }
        int i;int os=0;int s=0;int pos=0;int p=0;
        for( i=0;i<3-1;i++)
        {
            double d=(arr[i]+math[i]+science[i])/50;
                       if(p<arr[i]){
            p=arr[i];
            pos=i;
          
            }
              if(f<math[i]){
            f=math[i];
            os=i;
        }
        if(g<science[i]){
            g=science[i];
             s=i;
            
            
            
            }}
              System.out.println("highestmarks in  history"+" "+p+"name"+" "+name[pos]);
              
              System.out.println("highestmarks in  maths"+" "+f+"name"+" "+name[os]);
              
              System.out.println("highestmarks in  science"+" "+g+"name"+" "+name[s]);
               System.out.println("average="+p+f+g/d);
               
        }
    }
  
