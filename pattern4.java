public class pattern4
{
   public static void main(String args[])
   {
       for(int i = 1;i<=5;i++)
       {
           for(int j=i;j<=5;j++)
           {
               if((j==1)||(j==5)||(i==1)||(i==5)){
               System.out.print("1");
            }
            else{
            System.out.print("0");
        }
      }
      System.out.println();
    }
    }
}