// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers.
// 3. You are given a number "tar".
// 4. You are required to calculate and print true or false, if there is a subset the elements of which add 
//      up to "tar" or not.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = scn.nextInt();
        
        int target = scn.nextInt();
        
        // int[][] dp = new int[n + 1][target + 1];
        
        // for(int i=0; i<=n; i++){
        //     Arrays.fill(dp[i], -1);
        // }
        //System.out.println(targetSum(arr, 0, 0, target, dp));
        
        boolean[][] dp = new boolean[n+1][target+1];
        for(int i=0; i<dp.length; i++)
        {
        	for(int j=0; j<dp[0].length; j++)
        	{
        		if(i==0 && j==0)
        			dp[i][j] = true;
        		else if(i==0)
        			dp[i][j] = false;
        		else if(j==0)
        			dp[i][j] = true;
        		else{
        			if(dp[i-1][j] == true)
        				dp[i][j] = true;
        			else{
            				int val = arr[i-1];
            				if(j >= val){
            					if(dp[i-1][j-val] == true){
            						dp[i][j] = true;
            					}
            			    }
        			
        		        }
        	        }
                }
            }
            System.out.println(dp[n][target]);
    }
    
    public static boolean targetSum(int[] arr, int idx, int sum, int target, int[][] dp)
    {
         if(idx == arr.length || target==sum)
        {
            if(target == sum) return true;
            return false;
        }
        
        if(sum > target) return false;
        if(dp[idx][sum] != -1) {
            return (dp[idx][sum] == 1) ? true : false;
        }
        
        // yes
        boolean yes = targetSum(arr, idx + 1, sum + arr[idx], target, dp);
        
        // no
        boolean no = targetSum(arr, idx + 1, sum, target, dp);
        
        
        if(yes == true || no == true){
            dp[idx][sum] = 1;
            return true;
        }else{
            dp[idx][sum] = 0;
            return false;
        }
    }
}