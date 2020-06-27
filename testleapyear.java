import java.util.Scanner;
public class testleapyear
{
    
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner sc = new Scanner (System.in);
        int year;
        System.out.println("Enter a 4 digit year (yyyy)");
        year = sc.nextInt();
            if(year%100==0)
            {    if(year%400==0)
                       System.out.println("Year "+year+" is a leap year");
                       else
                       System.out.println("Year "+year+" is not a leap year");
                    }
                    else{
                        if(year%4==0)
                           System.out.println("Year"+year+"is a leap year");
                           else
                           System.out.println("Year"+year+"is not a leap year");
                        }
    }
}