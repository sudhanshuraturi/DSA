import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      
      int num=0,a=0;
      while(n>0)
      {
          num+=(n%10)*Math.pow(b,a);
          n = n/10;
          a++;
      }
      
      return num;
   }
  }