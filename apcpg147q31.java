
import java.io.*;
public class apcpg147q31
{
    int serialno;
    String name;
    double discount;
    double netamount;
    double ticketamount;
    
   void input()throws IOException{
        InputStreamReader ir = new  InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader (ir);
        System.out.println("enter serialno and name ticketamount");
        serialno = Integer.parseInt(buf.readLine());
        name = buf.readLine();
        ticketamount=Double.parseDouble(buf.readLine());
    }
    void display(){
        System.out.println(serialno+ " "+name+ " "+ ticketamount+ " "+discount+ " "+netamount);
        
   
    }
    void calc(){
        if(ticketamount>70000){
            discount = ticketamount*0.18;
            netamount = ticketamount - discount;
        }
            else if((ticketamount>=55001) &&(ticketamount<=70000)){
            discount = ticketamount*0.16;
             netamount = ticketamount - discount;
            }
}
public static void main()throws IOException{
    

    int i;
   apcpg147q31 obj[] = new apcpg147q31[2];
    
    for(i=1;i<=2;i++){
      obj[i].input();
        obj[i].calc();
    }
    System.out.println("serialno name ticket amount discount netamount");
    for(i=0;i<=2;i++)
   {
        obj[i].display();
    }
}}

