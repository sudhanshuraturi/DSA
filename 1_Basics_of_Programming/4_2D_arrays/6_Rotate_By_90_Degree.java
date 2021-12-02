
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[][] a = new int[n][n];
    
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<n;j++)
                a[i][j] = scn.nextInt();
        }
        
        for(int r=0;r<n;r++)
        {
            for(int c=r;c<n;c++)
            {
                int temp = a[r][c];
                a[r][c] = a[c][r];
                a[c][r] = temp;
            }
        }
        
        
        for(int k=0;k<n;k++)
        {
            for(int i=0,j=a.length-1; i<j; i++,j--)
            {
                int temp = a[k][i];
                a[k][i] = a[k][j];
                a[k][j] = temp;
            }
            
        }
        
        display(a);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
  

}