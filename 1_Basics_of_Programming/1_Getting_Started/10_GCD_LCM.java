// Gcd And Lcm

// 1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
// 2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
// 3. Take input "num1" and "num2" as the two numbers.
// 4. Print their GCD and LCM.

import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      int divident = n1;
      int divisor = n2;
      
    
      while(divident%divisor !=0)
      {
          int remainder = divident % divisor;
          divident = divisor;
          divisor = remainder;
      }
      
      System.out.println(divisor);
      System.out.println((n1*n2)/divisor);
     }
    }