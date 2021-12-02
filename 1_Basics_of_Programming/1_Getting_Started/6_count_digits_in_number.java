// Count Digits In A Number

// 1. You've to count the number of digits in a number.
// 2. Take as input "n", the number for which the digits has to be counted.
// 3. Print the digits in that number.

import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    while(n>0)
    {
        n/=10;
        count++;
    }
    
    System.out.println(count);
   }
  }