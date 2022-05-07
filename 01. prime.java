import java.util.*;
  
  public class prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
       int t = scn.nextInt();
       for(int i = 1;i<=t;i++){
           int n = scn.nextInt();
           int x = 2,c = 0;
           while(x<=n/2){
               if(n%x==0){
                   c++;
                   break;
               }
              x++; 
           }
           if(c==0){
               System.out.println("prime");
           }
           else
           {
                System.out.println("not prime");
           }
       }
  
   }
  }