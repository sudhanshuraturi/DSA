	import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            
            int profits[] = new int[n];
            int wt[] = new int[n];
            
            for(int i=0; i<n; i++)
                profits[i] = scn.nextInt();
            for(int i=0; i<n; i++)
                wt[i] = scn.nextInt();
            
            int cap = scn.nextInt();
            
            int dp[] = new int[cap+1];
            
            for(int i=1; i<=cap; i++)
            {
                for(int j=0; j<n; j++)
                {
                    int remCap = i - wt[j];
                    if(remCap >= 0)
                    {
                        int remProfit = dp[remCap];
                        int totalProfit = profits[j]+remProfit;
                        dp[i] = Math.max(dp[i],totalProfit);
                        
                    }
                }
            }
            System.out.println(dp[cap]);
            
	    }

	}