import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++)
            a[i] = scn.nextInt();
            
        System.out.println(maxOfArray(a,a.length-1));
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx == -1)
            return Integer.MIN_VALUE;
        
        int max = maxOfArray(arr,idx-1);
        
        max = arr[idx] > max? arr[idx]: max;
        
        return max;
    }

}