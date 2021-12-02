// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed infinite transactions, but have to cooldown for 1 day after 1 transaction
// i.e. you cannot buy on the next day after you sell, you have to cooldown for a day at-least before buying again.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] cost = new int[n];
        for(int i=0; i<n; i++){
            cost[i] = scn.nextInt();
        }
        
        
        // Approach 1: Buy on dp[i - 2][1] (One Day Cooldown)
        // int[][] dp = new int[n][2];
        // dp[0][0] = -cost[0]; 
        // dp[0][1] = 0;
        
        
        // for(int i=1; i<n; i++)
        // {
        //     // Extra Buy
        //     dp[i][0] = Math.max(dp[i-1][0], (i - 2) >= 0 ? (dp[i-2][1] - cost[i]) : -cost[i]);
            
        //     // Complete Sell
        //     dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] + cost[i]);
        // }
        
        // System.out.println(dp[n-1][1]);
        
        
        // Approach 2: Buy on Cooldown
        int[][] dp = new int[n][3];
        dp[0][0] = -cost[0];
        dp[0][1] = dp[0][2] = 0;
        
        
        for(int i=1; i<n; i++)
        {
            // Extra Buy
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - cost[i]);
            
            // Sell
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] + cost[i]);
            
            // Cooldown
            dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1]);
        }
        
        System.out.println(dp[n - 1][1]);
    }

}