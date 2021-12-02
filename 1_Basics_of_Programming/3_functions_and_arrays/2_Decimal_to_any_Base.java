import java.util.*;
import java.lang.*; 
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
   public static int getValueInBase(int n, int b){
      int num=0,a=0;
      while(n>0)
      {
          num+=(n%b)*Math.pow(10,a);
          n = n/b;
          a++;
      }
      
      return num;
   }
  }