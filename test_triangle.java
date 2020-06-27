/*this program first checks which type of triangle it is
 * then it finds the area
 * and also the perimeter
*/
import java.lang.*;
import java.util.*;
public class test_triangle
{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first side of the triangle in cm?");
    System.out.println("Enter the second side of the triangle in cm?");
    System.out.println("Enter the third side of the triangle in cm?");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if ((a==b)&&(b==c)&&(c==a))
       System.out.println("The triangle is an equilateral triangle");
    else if ((a==b)&&(c!=a)||(a==c)&&(b!=a)||(b==c)&&(a!=c))
       System.out.println("The triangle is an isosceles triangle");
    else if ((a!=b)&&(b!=c)&&(c!=a))
       System.out.println("The triangle is a scalene triangle");
    double s=(a+b+c)/2;
    double A=(s-a),B=(s-b),C=(s-c);
    double S=(s*A*B*C);
    double area=Math.sqrt(S);
    int perimeter=a+b+c;
       System.out.println("The area of the triangle is  "+area+" cm");
       System.out.println("The perimeter of the triangle is  "+perimeter+" cm");
   }
}
    


