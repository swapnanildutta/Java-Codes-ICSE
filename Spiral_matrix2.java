import java.util.*;
public class Spiral_matrix2
{
   int size;
   int m[][];
   public Spiral_matrix2(int s)
   {
         m=new int[size=s][s];
   }
   public void Show()
   {
      for(int i=0;i<m.length;i++)
      {
          for(int j=0;j<m[i].length;j++)
          {
              System.out.printf("%4d",m[i][j]);
          }
          System.out.println();
      }
   }
   public void fill()
   {
       int count=1;
       int row1=0;
       int col1=0;
       int row2=m.length-1;
       int col2=m.length-1;
       while(count<=(m.length*m.length))
       {
          for(int i=col1;i<=col2;i++)
          {
              m[row1][i]=count++;
          }
          for(int i=row1+1;i<=row2;i++)
          {
              m[i][col2]=count++;
          }
          for(int i=col2-1;i>=col1;i--)
          {
              m[row2][i]=count++;
            }
            for(int i=row2-1;i>=row1+1;i--)
            {
                m[i][row1]=count++;
            }
           row1++;row2--;
           col1++;col2--;
       }
       
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and column=");
       int size=sc.nextInt();
       Spiral_matrix2 obj=new Spiral_matrix2(size);
       obj.fill();
       obj.Show();
   }
}
