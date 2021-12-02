import java.io.*;
import java.util.*;

//check greedy o(n) solution
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = scn.nextInt();
        
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(climbMem(0,n-1,arr,dp));
    }
    //1+min(x,y,z)
    public static int climbMem(int src,int dest, int[] arr, int[] dp)
    {
        if(src > dest) return Integer.MAX_VALUE;
        if(src == dest) return 0;
        
        if(dp[src] != -1)
            return dp[src];
            
        int minMoves = Integer.MAX_VALUE;
        
        for(int jumps=1; jumps<=arr[src]; jumps++)
        {
            int ans = climbMem(src+jumps, dest, arr, dp);
            minMoves = Math.min(minMoves, ans);
        }
        if(minMoves != Integer.MAX_VALUE)
            dp[src] = minMoves+1;
        else
            dp[src] = minMoves;
        return dp[src];
       
    }

}