// 1. You are given a number n, representing the number of rows.
// 2. You are given a number m, representing the number of columns.
// 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
// 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
//      any row in the left wall.
// 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).

// goldmine

// 6. Each cell has a value that is the amount of gold available in the cell.
// 7. You are required to identify the maximum amount of gold that can be dug out from the mine.
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int arr[][] = new int[n][m];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
                arr[i][j] = scn.nextInt();
        }
        
        
        int dp[][] = new int[n][m];
        
        for(int i=0; i<arr.length; i++)
        {
            Arrays.fill(dp[i],-1);
        }
        
        //for memoization
        //int max = 0;
        // for(int i=0; i<arr.length; i++)
        // {
        //     max = Math.max(max,max_gold(i,0,arr,dp));
        // }
        
        //for tabulation
        int max = max_gold_tab(arr,dp);
        
        System.out.println(max);
    }
    
    public static int max_gold_tab(int[][] arr, int[][] dp){
        int n = arr.length-1, m = arr[0].length-1;
        
        for(int sc=m; sc>=0; sc--)
        {
            for(int sr=0; sr<=n; sr++)
            {
                if(sc == dp[0].length-1)
                    dp[sr][sc] = arr[sr][sc];
                    
                int up = sr-1>=0 ? dp[sr-1][sc+1]:0;
                int right = dp[sr][sc+1];
                int down = sr+1<=n ? dp[sr+1][sc+1]:0;
                
                dp[sr][sc] = arr[sr][sc] + Math.max(up,Math.max(right,down));
            }
        }
        int max = 0;
        for(int i=0; i<arr.length; i++)
        {
            max = Math.max(max,dp[i][0]);
        }
        
        return max;
    }
    
    public static int max_gold(int sr,int sc, int[][] arr,int dp[][]){
        if(sr<0||sr>=arr.length)//-ve base
            return 0;
        
        if(sc == arr[0].length-1)
            return arr[sr][sc];
        
        if(dp[sr][sc] != -1)
            return dp[sr][sc];
        
        int up = max_gold(sr-1,sc+1,arr,dp);
        int right = max_gold(sr,sc+1,arr,dp);
        int down = max_gold(sr+1,sc+1,arr,dp);
        
        dp[sr][sc] = arr[sr][sc] + Math.max(up,Math.max(right,down));
        
        return dp[sr][sc];
    }

}