import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       
       int borrow = 0, product = 1, new_num = 0;
       while(n2!=0)
       {
           int d1 = n2%10;
           int d2 = n1%10;

           int diff = (d1 - borrow) - d2;
           
           if(diff<0)
           {
               diff += b;
               borrow = 1;
           }
           else
               borrow = 0; 
            
           
           n1/=10;
           n2/=10;
           
           new_num += (diff*product);
           
           product*=10;
       }
       return new_num;
   }
  
  }