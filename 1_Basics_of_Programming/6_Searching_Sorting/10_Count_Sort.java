import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   //where to use thiss sort
   int size = max-min+1;
   int[] freq_arr = new int[size];
   
   for(int i=0; i<arr.length; i++)//why?
       freq_arr[arr[i]-min]++;
   
   for(int i=1; i<size; i++)//why?
       freq_arr[i] = freq_arr[i] + freq_arr[i-1];
   
    int[] ans = new int[arr.length];
    
    for(int i=arr.length-1; i>=0; i--) // why reverse loop?
    {
        int val = arr[i];
        int pos = val-min;
        int idx = freq_arr[pos]-1;
        ans[idx] = arr[i];
        freq_arr[pos]--;
    }
    for(int i=0; i<arr.length; i++)
        arr[i] = ans[i];
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}