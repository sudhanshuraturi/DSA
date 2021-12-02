import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
      int  destBase= scn.nextInt();
     
     
      int num=0,a=0;
      while(n>0)
      {
          num+=(n%10)*Math.pow(sourceBase,a);
          n = n/10;
          a++;
      }
      
      a=0;
      int answer=0;
      while(num>0)
      {
          answer+=(num%destBase)*Math.pow(10,a);
          num = num/destBase;
          a++;
      }
      
      
      System.out.println(answer);
     
   }   
  }