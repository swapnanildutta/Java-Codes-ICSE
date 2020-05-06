import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        int A,n,i,j;
        Scanner sc=new Scanner(System.in);
          System.out.println("Welcom to Calculator , What do you want to do?");
          System.out.println("1.Addition , 2.Subtraction , 3.Multiplication , 4.Division");
        n=sc.nextInt();
        Calculator ob=new Calculator();
          switch(n)
           {
               case 1:{
                         System.out.println("Enter the first number : ");
                         System.out.println("Enter the second number : ");
                         i=sc.nextInt();
                         j=sc.nextInt();
                         A=ob.Add(i,j);
                         System.out.println("The result of addition is = "+A);
                         break;
                       }
               case 2:{
                         System.out.println("Enter the first number : ");
                         System.out.println("Enter the second number : ");
                         i=sc.nextInt();
                         j=sc.nextInt();
                         A=ob.Sub(i,j);
                         System.out.println("The result of Subtraction is = "+A);
                         break;
                       }
               case 3:{
                         System.out.println("Enter the first number : ");
                         System.out.println("Enter the second number : ");
                         i=sc.nextInt();
                         j=sc.nextInt();
                         A=ob.Pro(i,j);
                         System.out.println("The result of multiplication is = "+A);
                         break;
                      }
               case 4:{
                         System.out.println("Enter the divident number : ");
                         System.out.println("Enter the divisor number : ");
                         i=sc.nextInt();
                         j=sc.nextInt();
                         A=ob.Div(i,j);
                         int r=i%j;
                         System.out.println("The result of division is = "+A);
                         System.out.println("The remainder is = "+r);
                         break;
                      }
                      
           }
    }
    public int Add(int i,int j)
         {
             int x;
             x=i+j;
             return x;
         }
    public int Sub(int i,int j)
         {
             int x;
             if (i>j)
                 x=i-j;
             else
                 x=j-i;
             return x;
         }
    public int Pro(int i,int j)
          {
              int x;
              x=i*j;
              return x;
          }
    public int Div(int i,int j)
          {
              int x;
              if (i>j)
                  x=i/j;
              else
                  x=j/i;
              return x;
           }
}
