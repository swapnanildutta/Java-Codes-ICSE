import java.io.*;
public class kanchanmala
{
public static void main (String args[]) throws IOException
{String q ="";
String st = "MALAYALAM";
int a = st.length();
for (int i = 0;i<a;i++)
{
if (st.charAt(i)=='A')
{
q = q+ "";
}
else{
q=q+st.charAt(i);
}
}

System.out.println("The ans"+q);
}
}


















