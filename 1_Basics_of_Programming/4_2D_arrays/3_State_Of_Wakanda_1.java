// For example, the monuments are named as follows:
// 1  2  3
// 4  5  6
// 7  8  9

// Path followed by traveler: 1->4->7->8->5->2->3->6->9

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    
    int[][] a = new int[n][m];
    
    for(int i=0;i<n;i++)
    {    for(int j=0;j<m;j++)
            a[i][j] = scn.nextInt();
    }        
    for(int col=0;col<m;col++)
    {    
        if(col%2 == 0)
        {
            for(int row=0; row<n; row++)
            {
                System.out.println(a[row][col]);
            }
        }
        else
        {
            for(int row=n-1; row>=0; row--)
            {
                System.out.println(a[row][col]);
            }

        }
    }
 }

}