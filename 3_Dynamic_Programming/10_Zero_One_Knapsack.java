import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val[] = new int[n];
        int wt[] = new int[n];
        
        for(int i=0; i<n; i++)
            val[i] = scn.nextInt();
        
        for(int i=0; i<n; i++)
            wt[i] = scn.nextInt();
        
        int cap = scn.nextInt();
        
        System.out.println(solve(val,wt,cap));
        
    }
    
    public static int solve(int[] profit, int[] weight, int cap) {
        int n = profit.length;
        int[][] dp = new int[n+1][cap+1];

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=cap; j++)
            {
                int no = dp[i-1][j];
                int yes = (j-weight[i-1]<0)? 0 : dp[i-1][j-weight[i-1]] + profit[i-1];

                dp[i][j] = Math.max(yes,no);
            }
        }

        return dp[n][cap];
    }


}