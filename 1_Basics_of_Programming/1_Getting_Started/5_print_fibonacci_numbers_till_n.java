// 1. You've to print first n fibonacci numbers.
// 2. Take as input "n", the count of fibonacci numbers to print.
// 3. Print first n fibonacci numbers.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int a=0,b=1,c=1;
      
      for(int i=0;i<n;i++)
      {
          System.out.println(a);
          a = b;
          b = c;
          c = a+b;
      }
   }
  }