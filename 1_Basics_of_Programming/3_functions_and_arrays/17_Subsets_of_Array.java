
// Sample Input
// 3
// 10
// 20
// 30
// Sample Output
// -	-	-	
// -	-	30	
// -	20	-	
// -	20	30	
// 10	-	-	
// 10	-	30	
// 10	20	-	
// 10	20	30	

import java.io.*;
import java.util.*;
import java.lang.Math;
public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++)
      a[i] = scn.nextInt();

    int limit = (int)Math.pow(2, n);
    for (int st = 0; st < limit; st++)
    {
      int temp = st;
      String res = "";
      for (int i = a.length - 1; i >= 0; i--)
      {
        
        if (temp % 2 == 1)
          res = ( a[i] + "	" + res);
        else
          res = "-	" + res;
          
        temp /= 2;
      }
      System.out.println(res);
    }

  }

}