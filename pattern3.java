public class pattern3
{
   public static void main(String args[])
   {
      for (int i = 1;i<=5;i++)
      {
          for (int k = i;k>1;k--)
          {
              System.out.print(k);
            }
              for(int j = 1;j<=6-i;j++){
               
               System.out.print(j);
            }
          System.out.println();
   }
}
}
