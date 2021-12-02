//The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
import java.util.*;
//why only one saddle??? -- take 1 saddle point in a row then other saddle point
// on the next row next cols now assume properties of saddle for both and the properties will be violating for both at same time
public class Main{
    public static void main(String args[])
    {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int a[][] = new int[n][n];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j] = scn.nextInt();
        
            
        for(int i=0;i<n;i++)
        {
            int least_in_row=0, max_in_col=0;
            for(int j=0;j<n;j++)
            {
                if(isLeastInRow(a[i],a[i][j]) && isMaxInCol(a,j,a[i][j]))
                {
                    System.out.println(a[i][j]);
                    return;
                }
            }
        }
        
        System.out.println("Invalid input");
    }
    
    public static boolean isLeastInRow(int[] a,int k)
    {
        for(int i=0;i<a.length;i++)
            if(a[i]<k)
                return false;
        return true;
    }
    
    public static boolean  isMaxInCol(int a[][],int col,int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i][col]>k)
                return false;
        }
        return true;
    }
    
}