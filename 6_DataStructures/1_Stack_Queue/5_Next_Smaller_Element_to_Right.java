// "Next smaller element on the right" of an element x is defined as the first element to right of x having value smaller than x.
// Note -> If an element does not have any element on it's right side smaller than it, consider -1 as it's "next smaller element on right"
// e.g.
// for the array [2 5 9 3 1 12 6 8 7]
// Next smaller for 2 is 1
// Next smaller for 5 is 3
// Next smaller for 9 is 3
// Next smaller for 3 is 1
// Next smaller for 1 is -1
// Next smaller for 12 is 6
// Next smaller for 6 is -1
// Next smaller for 8 is 7
// Next smaller for 7 is -1

import java.io.*;
import java.util.*;

public class Main {
  public static void display(int[] a) {
    StringBuilder sb = new StringBuilder();

    for (int val : a) {
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(br.readLine());
    }

    int[] nge = solve(a);
    display(nge);
  }

  public static int[] solve(int[] arr) {
       int n = arr.length;
   int[] ans = new int[n];
   Arrays.fill(ans,-1);
   
   Stack<Integer> stk = new Stack<Integer>();
   for(int i = arr.length-1; i>=0; i--)
   {
       while(stk.isEmpty()==false && stk.peek()>=arr[i])
        stk.pop();
       
       if(stk.isEmpty()==false)
        ans[i] = stk.peek();
        
       stk.push(arr[i]);
        
   }
   return ans;
 
  }

}