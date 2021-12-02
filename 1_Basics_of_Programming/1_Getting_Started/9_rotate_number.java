// Rotate A Number

// 1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.

// 2. Take as input n and k.

// 3. Print the rotated number.

// 4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
//   n = 12340056
//   k = 3
//   r = 05612340


import java.util.*;
import java.lang.Math;
     
   public class Main{
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int digits = 0,num_temp = n;
      
      while(num_temp>0)
      {
          digits++;
          num_temp/=10;
      }
      
      k = ((k%digits)+digits)%digits;
      //or  k=k%dig 
      //    if(k<0)k+=dig
      
      if(k==0)
        System.out.println(n);
        
      else 
      {
          int divisor =(int)(Math.pow(10,k));
              
          int last_k_digits = n%divisor;
          n = n/divisor;
          n = (last_k_digits * (int)Math.pow(10,digits-k))+n;
          System.out.println(n);
      }
      
    }
   }