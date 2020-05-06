import java.util.*;
public class Date_check_complete
{
    public boolean isLeapyear(int y)
    {
            if((y%400==0)||(y%4==0)&&(y%100!=0))
                    return true;     
        return false;
    }
    public boolean isCorrect(int d,int m,int y)
    {
        boolean c=false;
        switch(m)
        {
          case 1: case 3: case 5:case 7: case 8: case 10:case 12:
             if(d>=1 && d<=31)
                c=true;
               break;
          case 4: case 6: case 9: case 11:
             if(d>=1 && d<=30)
                c=true;
                break;
          case 2:if(isLeapyear(y))
                  { if (d>=1 && d<=29)
                      c=true;
                  }   
                 else
                   {
                    if (d>=1 && d<=28)
                      c=true;
                   }
                  break;
          
        }
        return(c);
    }
    int NumberofDays(int d,int m,int y)
    {
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        int s=0;
        if(isCorrect(d,m,y)){
        if(isLeapyear(y))
            days[2]=29;
        
        for(int i=1;i<m;i++)
             s=s+days[i];
        s=s+d;
    }
    return(s);
   }
   public void kiBar(int d,int m,int y,String startingdayofyear)
     {
       String bar[]={"","Sun","Mon","Tue","Wed","Thurs","Fri","Sat"};
       int pos=0;
       int nod=NumberofDays(d,m,y);
       for(int i=1;i<bar.length;i++)
         {
           if(bar[i].equalsIgnoreCase(startingdayofyear))
             {
               pos=i;
               break;
             }
         }
       if(pos>0)
          {
            nod=nod+pos-1;
            int b=nod%7;
            System.out.println(bar[b]);
          }
       else
         System.out.println("Invalid");
     }
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the date:");
       int d=sc.nextInt();
       System.out.println("Enter the month:");
       int m=sc.nextInt();
       System.out.println("Enter the year:");
       int y=sc.nextInt();
       System.out.println("Enter the Starting day of the year:");
       String startingdayofyear=sc.next();
       if(isCorrect(d,m,y)){
           if(isLeapyear(y))
                 System.out.println("It is a leap year");
           else
                 System.out.println("It is a leap year");
           kiBar(d,m,y,startingdayofyear);
       }
   }  
}
