import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    countSort(arr,1000000,100,32);
    countSort(arr,10000,100,13);
    countSort(arr,1,10000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
   
   int size = range;
   int[] freq_arr = new int[size];
   
   for(int i=0; i<arr.length; i++)
       freq_arr[Integer.parseInt(arr[i])/div%mod]++;
   
   for(int i=1; i<size; i++)
       freq_arr[i] = freq_arr[i] + freq_arr[i-1];
   
    String[] ans = new String[arr.length];
    
    for(int i=arr.length-1; i>=0; i--)
    {
        int val = Integer.parseInt(arr[i])/div%mod;
        int pos = val;
        int idx = freq_arr[pos]-1;
        ans[idx] = arr[i];
        freq_arr[pos]--;
    }
    for(int i=0; i<arr.length; i++)
        arr[i] = ans[i];
   
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}