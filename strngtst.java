
import java.util.*;
public class strngtst
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character=");
        char ch=sc.nextLine().charAt(0);
      if(Character.isLetterOrDigit(ch)==true){
           if(Character.isLetter(ch)==true){
               System.out.println(ch+" is a letter");
               if(Character.isUpperCase(ch)==true)
                   System.out.println(ch+" is Uppercase");
               else
                   System.out.println(ch+" is Lowercase");
            }
           else if(Character.isDigit(ch)==true)
                   System.out.println(ch+" is a Digit");
                }
        else
              System.out.println(ch+" is a Special character");
    }
}
