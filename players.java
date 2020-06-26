import java.util.*;
public class players
{
    public static void main(){
    Scanner sc = new Scanner (System.in);
      String arr[] = new String[5] ;
      int score[] =new int[5];
      int max=0;int minpos=0;
    
    for(int i=0;i<5;i++){
        System.out.println("enter the player ame with score");
        arr[i]=sc.next();
        score[i]=sc.nextInt();
        
  
    }
    for(int i=0;i<5;i++){
        if(max<score[i]){
        max=score[i];
        minpos=i;}
          
     
    }
    System.out.println("name of player is"+" "+" "+arr[minpos]+" "+" "+"score is"+" "+max);
    
  
}
   
    
   
   
}                                                   