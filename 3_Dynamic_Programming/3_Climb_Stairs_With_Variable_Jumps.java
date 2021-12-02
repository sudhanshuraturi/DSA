// 1. You are given a number n, representing the number of stairs in a staircase.
// 2. You are on the 0th step and are required to climb to the top.
// 3. You are given n numbers, where ith element's value represents - till how far from the step you 
//      could jump to in a single move.  
//      You can of course jump fewer number of steps in the move.
// 4. You are required to print the number of different paths via which you can climb to the top.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        
        //System.out.println(climbRec(0,n,arr));
        //System.out.println(climbMem(0,n,arr,dp));
        System.out.println(climbTab(n,arr));
    }
    public static int climbRec(int src, int dest, int[] arr)
    {
        if(src > dest) return 0;
        if(src == dest) return 1;
        
        int totalPaths = 0;
        for(int jumps=1; jumps<=arr[src]; jumps++)
        {
            int xi = climbRec(src+jumps, dest, arr);
            totalPaths+=xi;
        }
        
        return totalPaths;
        
    }

    public static int climbMem(int src, int dest, int[] arr, int[] dp)
    {
        if(src > dest) return 0;
        if(src == dest) return 1;
        
        if(dp[src] != -1)
            return dp[src];
        
        int totalPaths = 0;
        for(int jumps=1; jumps<=arr[src]; jumps++)
        {
            int xi = climbMem(src+jumps, dest, arr, dp);
            totalPaths+=xi;
        }
        
        dp[src] = totalPaths;
        return dp[src];
        
    }
    
    public static int climbTab(int dest, int[] arr)
    {
        int n = arr.length;
        int dp[] = new int[n+1];
        dp[dest] = 1;
        
        for(int i = n-1; i>=0; i--)
        {
            int totalPaths = 0;
            for(int jumps=1; jumps<=arr[i]; jumps++)
            {
                if(i+jumps < dp.length)
                    totalPaths += dp[i+jumps];
                
            }
            dp[i] = totalPaths;
        }
        
        return dp[0];
        
    }

}