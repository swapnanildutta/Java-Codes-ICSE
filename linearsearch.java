
import java.util.*;
public class linearsearch
{
  public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,k=0;
        String sh=" ";
        String m[]=new String[5];
        for(i=0;i<5;i++)
        {
            System.out.println("enter names in the cell");
            m[i]=sc.nextLine();
        }
        System.out.println("enter the name to be searched");
        sh=sc.nextLine();
        for(i=0;i<5;i++)
        {
            if(m[i]==sh)
            k=1;
        }
        if(k==1)
        System.out.println("name found");
        else
        System.out.println(" not found");
    }
}

        
            
      
  

   