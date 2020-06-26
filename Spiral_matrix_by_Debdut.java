
/**
 * Write a description of class Spiral_matrix here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.5)
 */
import java.util.*;
public class Spiral_matrix_by_Debdut
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the matrix?");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        int i=1,j=0,k=-1,l=0,m=0,n=0,x=r*c;
        while(i<=x)
        { 
            if(l==0)
            {
                for(int a=0;;)
                {
                    arr[j][++k]=i++;
                    if(k==c-1)
                    {
                        l+=1;
                        break;
                    }
                }
            }
            else if(l==1)
            {
                for(int a=0;;)
                {
                    arr[++j][k]=i++;
                    if(j==r-1)
                    {
                        l+=1;
                        break;
                    }
                }
            }
            else if(l==2)
            {
                for(int a=0;;)
                {   
                    arr[j][--k]=i++;
                    if(k==n)
                    {
                        l+=1;
                        break;
                    }
                }
            }
            else if(l==3)
            {
                for(int a=0;;)
                {
                    if(arr[j-1][k]>0)
                    {
                        l+=1;
                        break;
                    }
                    arr[--j][k]=i++;
                    if(j==n)
                    {
                        l+=1;
                        break;
                    }
                }
            }
            if(l>3)
            {
                l=0;
                r--;
                c--;
                n+=1;
            }
        }
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr[i].length;j++)
            {
                System.out.printf("%5d",arr[i][j]);
            }
            System.out.println();
        }
    }
}
