// 1. You are given a number n representing the length of a floor space which is 2m wide. It's a 2 * n board.
// 2. You've an infinite supply of 2 * 1 tiles.
// 3. You are required to calculate and print the number of ways floor can be tiled using tiles.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        System.out.println(tiling(n,dp));
    }
    
    public static int tiling(int n, int[] dp)
    {
        if(n==0) return 0;//no board --check
        if(n==1) return 1;
        if(n==2) return 2;//2*2 me 2 tareeke
        if(dp[n] != -1)
            return dp[n];
        
        int ans = tiling(n-1,dp) + tiling(n-2,dp);
        dp[n] = ans;
        
        return ans;
    }
}