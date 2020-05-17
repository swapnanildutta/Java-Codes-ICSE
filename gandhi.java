import java.io.*;
class gandhi
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name?");
        String name=br.readLine();
        int f=name.lastIndexOf(' ');
        name=name+" ";
        int l=name.lastIndexOf(' ');
        String sur=name.substring(f+1,l);
        name=name.replace(sur,"");
        name=sur+" "+name;
        System.out.println("Name is "+name);
    }
}