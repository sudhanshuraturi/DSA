import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
       
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int dp[] = new int[n+1];
    //   Arrays.fill(dp,-1);
    //   System.out.println(fibRec(n));
    //   Arrays.fill(dp,-1);
    //   System.out.println(fibMem(n,dp));
       Arrays.fill(dp,-1);
       System.out.println(fibTab(n,dp));
    }
    
    public static int fibRec(int n)
    {
        if(n==0||n==1)
            return n;
        
        int fib1 = fibRec(n-1);
        int fib2 = fibRec(n-2);
        
        int fibn = fib1+fib2;
        
        return fibn;
    }
       
    public static int fibMem(int n, int[] dp)
    {
        if(n==0||n==1)
            return n;
        
        if(dp[n]!=-1)
            return dp[n];
            
        int fib1 = fibMem(n-1, dp);
        int fib2 = fibMem(n-2, dp);
        
        dp[n] = fib1+fib2;
        return dp[n];
     
    }
    public static int fibTab(int n, int[] dp)
    {
       dp[0] = 0;
       dp[1] = 1;
       
       for(int i=2;i<=n;i++)//dp size n+1
       {
            dp[i] = dp[i-1]+dp[i-2];
       }
       
       return dp[n];
     }

}