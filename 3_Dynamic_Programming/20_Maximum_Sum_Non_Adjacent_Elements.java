// 1. You are given a number n, representing the count of elements.
// 2. You are given n numbers, representing n elements.
// 3. You are required to find the maximum sum of a subsequence with no adjacent elements.

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++)
      arr[i] = scn.nextInt();

    int lastTaken = 0;
    int[][] dp = new int[n + 1][2];
    for(int i=0; i<=n; i++){
        Arrays.fill(dp[i], -1);
    }

    System.out.println(maxSum(arr, 0, lastTaken, dp));
  }

  public static int maxSum(int[] arr, int idx, int lastTaken, int[][] dp) {
    if (idx >= arr.length) {
      return 0;
    }

    if (dp[idx][lastTaken] != -1)
      return dp[idx][lastTaken];

    if (lastTaken == 1) {
      int ansNo = maxSum(arr, idx + 1, 0, dp);
      dp[idx][lastTaken] = ansNo;
      return ansNo;
    }

    int ansYes = arr[idx] + maxSum(arr, idx + 1, 1, dp);
    int ansNo = maxSum(arr, idx + 1, 0, dp);
    int ans = Math.max(ansYes, ansNo);
    dp[idx][lastTaken] = ans;
    return ans;
  }
}