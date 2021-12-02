import java.io.*;
import java.util.*;

public class Main {
    //shell 3 will never come in given example since constraint says 0<s<min(n,m)/2
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
       int m = scn.nextInt();
       
       int[][] a = new int[n][m];
       
       for(int i=0;i<n;i++)
        for(int j=0;j<m;j++)
            a[i][j] = scn.nextInt();
       
       int shell_number = scn.nextInt();
       int rotations = scn.nextInt();
       
       //capturing shell
       int[] required_shell = captureShell(a,shell_number);
       
       //rotating shell array
       required_shell = rotateArray(required_shell,rotations);
       
       //fit in shell
       a = fitInShell(a,shell_number,required_shell);
       
       //call display function
       display(a); 
        
        
    }
    
    public static int[] captureShell(int[][] a, int shell_number)
    {
        int n = a.length, m = a[0].length;
        
        
       //first row first col
       int fr = shell_number-1, fc = shell_number-1;
       
       //last row last col
       int lr = n-shell_number, lc = m-shell_number;
       
       //size of 1d array = all walls - 4 (ie common corner elements)
       int sizeOfShell = 2*(lr - fr + 1) + 2*(lc - fc + 1) - 4;
    
     
        int[] required_shell = new int[sizeOfShell];
        
        int c = 0;
        while(c < sizeOfShell)
        {
            for(int i=fr; i<lr; i++)
            {    
                required_shell[c] = a[i][fc];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=fc; i<lc; i++)
            {    
                required_shell[c] = a[lr][i];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=lr; i>fr; i--)
            {    
                required_shell[c] = a[i][lc];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=lc; i>fc; i--)
            {    
                required_shell[c] = a[fr][i];
                c++;
                if(c>=sizeOfShell) break;
            }
        }
        
        return required_shell;
    }
    
    public static int[] rotateArray(int[] a, int degree)
    {
    
    int n = a.length;
    degree = (degree%n + n)%n; 
    reverse(a,0, n - degree - 1);
    reverse(a,n-degree,n-1);
    reverse(a,0,n-1);
    
    return a;
    }
  
    public static void reverse(int a[],int start, int end)
    {
        while(start<end)
        {
              int temp = a[start];
              a[start] = a[end];
              a[end] = temp;
              start++;
              end--;
        }
    }
        
    
    
    public static int[][] fitInShell(int[][] a, int shell_number,int[] required_shell)
    {
        
        int n = a.length, m = a[0].length;
        
        
       //first row first col
       int fr = shell_number-1, fc = shell_number-1;
       
       //last row last col
       int lr = n-shell_number, lc = m-shell_number;
       
       
       int sizeOfShell = required_shell.length;
    
        
        int c = 0;
        while(c < sizeOfShell)
        {
            for(int i=fr; i<lr; i++)
            {    
                a[i][fc] = required_shell[c];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=fc; i<lc; i++)
            {    
                a[lr][i] = required_shell[c];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=lr; i>fr; i--)
            {    
                a[i][lc] = required_shell[c];
                c++;
                if(c>=sizeOfShell) break;
            }
            for(int i=lc; i>fc; i--)
            {    
                a[fr][i] = required_shell[c];
                c++;
                if(c>=sizeOfShell) break;
            }
        }
        
        return a;
        
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