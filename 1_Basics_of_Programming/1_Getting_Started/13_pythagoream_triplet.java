// Pythagorean Triplet

// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.


import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int flag = 0;
        
        if(a>b && a>c)
        {
            if(a*a == ((b*b) + (c*c)))
                flag = 1;
        }
        else if(b>c)
        {
            if(b*b == ((a*a) + (c*c)))
                flag = 1;
        }
        else
        {
            if(c*c == ((a*a) + (b*b)))
                flag = 1;
        }
        
        System.out.println(flag==1?"true":"false");
   }
  }