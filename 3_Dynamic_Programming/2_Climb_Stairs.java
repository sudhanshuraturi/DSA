// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. In one move, you are allowed to climb 1, 2 or 3 stairs.
// 4. You are required to print the number of different paths via which you can climb to the top.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        
        // System.out.println(climbRec(0,n));
        // System.out.println(climbMem(0,n,dp));
        System.out.println(climbTab(n));
    }
    public static int climbRec(int src, int dest)
    {
        if(src > dest)
            return 0;
        
        if(src == dest)
            return 1;
        
        int one = climbRec(src+1,dest);
        int two = climbRec(src+2,dest);
        int three = climbRec(src+3,dest);
        
        return one+two+three;
    }
    
    public static int climbMem(int src, int dest, int dp[])
    {
        if(src > dest)
            return 0;
        
        if(src == dest)
            return 1;
        
        if(dp[src] != -1)
            return dp[src];
        
        int one = climbRec(src+1,dest);
        int two = climbRec(src+2,dest);
        int three = climbRec(src+3,dest);
        dp[src] = one+two+three;
        
        return dp[src];
    }
    
    public static int climbTab(int dest)
    {
        int[] dp = new int[dest+1];
        dp[dest] = 1;
        
        for(int i=dest-1; i>=0; i--)
        {
            dp[i] = dp[i+1];
            if(i+2 < dp.length)
                dp[i]+= dp[i+2];
            if(i+3 < dp.length)
                dp[i]+= dp[i+3];
        }
        return dp[0];
    }

}