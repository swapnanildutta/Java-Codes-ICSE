import java.util.*;
public class Magic_square
{
     int m[][];
     int size;
     public void Magic_square(int s)
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
         int ch=1;
         int r=0;
         int c=size/2;
         while(ch<=(size*size))
         {
             m[r][c]=ch++;
             r--;
             c--;
             if(r<0&&c>=0)
                  r=size-1;
             else if(r>=0&&c<0)
                  c=size-1;
             else if((r<0&&c<0)||(m[r][c]>0))
             {
                 r+=2;
                 c+=1;
             }
         }
     }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number of rows and columns=");
         int a=sc.nextInt();
         Magic_square obj=new Magic_square();
         obj.Magic_square(a);
         obj.fill();
         obj.Show();
     }
}