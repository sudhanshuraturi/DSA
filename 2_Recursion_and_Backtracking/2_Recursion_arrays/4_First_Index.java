import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        
        for(int i=0;i<n;i++)
            a[i] = scn.nextInt();
        
        int x = scn.nextInt();
            
        System.out.println(firstIndex(a,0,x));
    }

    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx == arr.length)
            return -1;
         
        if(arr[idx] == x)
            return idx;
        
        int index = firstIndex(arr,idx+1,x);
        
        return index;
        
    }

}