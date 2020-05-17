import java.util.*;
public class keath_number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int n=sc.nextInt();
        String str=Integer.toString(n);
        int arr[]=new int[str.length()];
        for(int i=0;i<str.length();i++)
            arr[i]=((int)(str.charAt(i))-48);
        int p=0,s=0;
        for(int k=0;k<100;k++)
        {
             s=0; 
             for(int i=0;i<str.length();i++)
                 s+=arr[i];
             if(s>n)
             {
                 System.out.println("Not a keath number");
                 break;
             }
             else if(s==n)
             {
                 System.out.println("Is a keath number");
                 break;
             }
             else{
                 if(p==arr.length)
                    p=0;
                 arr[p++]=s;
             }
        }
    }
}
