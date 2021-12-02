// Prime Factorisation Of A Number

// 1. You are required to display the prime factorization of a number.
//     2. Take as input a number n.
//     3. Print all its prime factors from smallest to largest.
                               


import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  
  for(int div =2; n!=1; div++){
      while(n%div==0){
          n = n/div;
          System.out.print(div+" ");
      }
  }
 }
}