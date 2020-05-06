import java.util.*;
public class Binary_search_recursion
{
    int a[]=new int[10];
    int n=0;int i=0;int r=0;
   public void input()
   {
       Scanner sc =new Scanner(System.in);
       System.out.println("enter the numbers");
       for(int k=0;k<a.length;k++){
          a[k]=sc.nextInt();
       }
       System.out.println("Enter the number to be searched");
       n=sc.nextInt();
   }
   int lb=0;int ub=a.length()-1;
   void bsearch(int a[],int n,int lb,int ub)
   {
       int m=(lb+ub)/2;
       if(lb<=ub){
       if(n==a[m])
       {
              r=1;
              break;
       }
       if(n>a[m])
       {
           lb=m+1;
       }
       if (n<a[m])
           ub=m-1;
         bsearch(a[],n,lb,ub);
       }
          System.out.println("Found");
          
   }
}
