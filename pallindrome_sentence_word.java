
/**
 * Write a description of class pallindrome_sentence_word here.
 * 
 * @author (Debdut Goswami) 
 * @version (3.1.5)
 */
import java.io.*;
public class pallindrome_sentence_word
{
public static void main(String args[])throws IOException
    {
InputStreamReader read =new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the sentence?");
        String str=in.readLine();
str=str+" ";
        String pall=" ";
        String o=" ";
int l=str.length();
for(int i=0;i<l;i++)
        {
char ch=str.charAt(i);
if(ch=='.')
            {
str=str.replace(ch,' ');
            }
        }
for(int i=0;i<l;i++)
        {
if(str.charAt(i)==' ')
            {
pall=pall.toLowerCase();
                o=o.toLowerCase();
System.out.println(pall+" "+o);
boolean p=pall.equalsIgnoreCase(o);
System.out.println(p);
if(o.compareTo (pall)==0)
                {
System.out.println(pall);
                }
pall=" ";
                o=" ";
            }
else
            {
pall=str.charAt(i)+pall;
                o=o+str.charAt(i);
            }
        }
    }
}
