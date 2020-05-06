
import java.io.*;
public class count
{
public static void main (String args[]) throws IOException
{
int i, d = 0;
char c;
InputStreamReader read = new InputStreamReader(System.in);
BufferedReader in = new BufferedReader(read);
System.out.println("Enter the String");
String st = in.readLine();
int a = st.length();
for(i = 0; i < a; i++)
{
 c =(st.charAt(i));
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
d = d + 1;
}
System.out.println("Vowels ="+d);
}
}