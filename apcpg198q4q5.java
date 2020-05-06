import java.io.*;
class apcpg198q4q5
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,y,z;
        String st;
        String st1=" ";
        char b;
        System.out.println("enter the string");
        st=br.readLine();
        x=st.length();
        for(y=0;y<x;y++)
        {
            b=(st.charAt(y));
          if((b=='a')||(b=='e')||(b=='i')||(b=='o')||(b=='u')||(b=='A')||(b=='E')||(b=='I')||(b=='O')||
            (b=='U')){
           st1 = st1+"";
           }else{
               st1 = st1+b;
            }
        }
        
           System.out.println(st1);
          
           
        }}
    
            
            