//You are required to find the span of input. Span is defined as difference of maximum value and minimum value.

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    
    for(int i=0; i<n; i++)
    {    
        a[i] = scn.nextInt();
        if(a[i]<min)
            min = a[i];
        
        if(a[i]>max)
            max = a[i];
    }
        
    System.out.println(max-min);    
 }

}