
// Sample Input
// 3
// 10
// 20
// 30
// Sample Output
// 10	
// 10	20	
// 10	20   30	
// 20	
// 20	30	
// 30	

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    
    for(int i=0;i<n;i++)
        a[i] = scn.nextInt();
    
    //si--starting index
    //ei--ending index
    
    for(int si=0; si<n; si++)
    {
        for(int ei=si; ei<n; ei++)
        {
            for(int i=si; i<=ei; i++)
                System.out.print(a[i]+"	");
            System.out.println();
        }
    }
 }

}