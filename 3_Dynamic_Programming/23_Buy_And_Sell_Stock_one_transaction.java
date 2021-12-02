// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed a single transaction.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int a[] = new int[n];
       
       for(int i=0; i<n; i++)
        a[i] = scn.nextInt();
        
       int min_pt = a[0];//buying day price
       int max_profit = Integer.MIN_VALUE;
       
       for(int i=0; i<n; i++)
       {
           if(a[i]<min_pt)
            min_pt = a[i];
            
           int curr_profit = a[i] - min_pt;
           if(curr_profit > max_profit)
           max_profit = curr_profit;
           
       }
       System.out.println(max_profit);
    }

}