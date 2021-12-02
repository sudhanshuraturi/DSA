import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
    int max = Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++)
    {
        if(arr[i]>max)
            max = arr[i];
    }
    
    int exp=1;
    while(max>0)
    {
        countSort(arr,exp);
        exp*=10;
        max/=10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    
   int size = 10; //0 to 9
   int[] freq_arr = new int[size];
   
   for(int i=0; i<arr.length; i++)
       freq_arr[arr[i]/exp%10]++;
   
   for(int i=1; i<size; i++)
       freq_arr[i] = freq_arr[i] + freq_arr[i-1];
   
    int[] ans = new int[arr.length];
    
    for(int i=arr.length-1; i>=0; i--)
    {
        int val = arr[i]/exp%10;
        int pos = val;//-min;
        int idx = freq_arr[pos]-1;
        ans[idx] = arr[i];
        freq_arr[pos]--;
    }
    for(int i=0; i<arr.length; i++)
        arr[i] = ans[i];
   
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}








  }

}




