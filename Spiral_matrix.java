import java.util.*;
public class Spiral_matrix
{
   int size;
   int m[][];
   public Spiral_matrix(int s)
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
       int row=0;
       int col=size-1;
       for(int i=0;i<m.length;i++)
       {
           m[row][i]=count;
           count++;
       }
       row++;
       for(int i=row;i<m[i].length-1;i++)
       {
           m[row][col]=count;
           row++;
           count++;
       }
       for(int i=col;i>=0;i--)
       {
           m[row][i]=count;
           count++;
       }
       col=0;
       for(int i=row-1;i>=0;i--)
       {
           if(m[i][col]!=0)
                break;
           else
           {
                m[i][col]=count;
                count++;
           }
       }
       row=0;
       for(int i=0;i<=Math.round(m.length/2);i++)
       {
           row++;col++;
           for(int j=col;j<m.length-1-i;j++)
           {
             if(m[row][j]!=0)
                break;
             else
               {
                m[row][j]=count;
                count++;
               }
             ++col;
           }
           col--;
           for(int j=row;j<m.length;j++)
           {
             if(m[j][col]!=0)
                break;
             else
               {
                m[j][col]=count;
                count++;
               }
             row++;
           }
           /*row--;
           for(int j=col-1;j>0;j++)
           {
             if(m[row][j]!=0)
                break;
             else
               {
                m[row][j]=count;
                count++;
               }
           }
           row=i;col=i;*/
        }
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number of rows and column=");
       int size=sc.nextInt();
       Spiral_matrix obj=new Spiral_matrix(size);
       obj.fill();
       obj.Show();
   }
}
