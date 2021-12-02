// Reverse A Number

// 1. You've to display the digits of a number in reverse.
// 2. Take as input "n", the number for which digits have to be display in reverse.
// 3. Print the digits of the number line-wise, but in reverse order.

import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n>0)
        {
        
        System.out.println(n%10);    
        n/=10;
        
        }
    }
   }