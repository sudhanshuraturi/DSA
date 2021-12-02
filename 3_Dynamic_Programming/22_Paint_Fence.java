// 1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
// 2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int fences = scn.nextInt();
        int colors = scn.nextInt();
        
        // int[][] dp = new int[2][fences];
        
        // dp[0][1] = colors;
        // dp[1][1] = colors * (colors - 1);
        
        int previi = colors;
        int previj = colors * (colors - 1);
        
        
        for(int i=2; i<fences; i++)
        {
            // c1 == c2
            // dp[0][i] = dp[1][i - 1];
            int currii = previj;
            
            // c1 != c2
            // dp[1][i] = (colors - 1) * (dp[0][i - 1] + dp[1][i - 1]); 
            int currij = (colors - 1) * (previi + previj);
            
            previi = currii; previj = currij;
        }
        
        // System.out.println(dp[0][fences - 1] + dp[1][fences - 1]);
        System.out.println(previi + previj);    
    }
}