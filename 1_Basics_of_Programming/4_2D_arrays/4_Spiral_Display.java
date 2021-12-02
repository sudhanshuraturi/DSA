import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
    
        int[][] a = new int[n][m];
    
        for(int i=0;i<n;i++)
        {    
            for(int j=0;j<m;j++)
                a[i][j] = scn.nextInt();
        }        
        
        int frow=0,fcol=0,lrow=n-1,lcol=m-1,count=0,t_item = n*m;
        
        while(count <= t_item)
        {
            for(int k=frow; k<=lrow; k++)
            {
                System.out.println(a[k][fcol]);
                count++;
                
                if(count == t_item) return;
            }
            fcol++;
            
            for(int k=fcol; k<=lcol; k++)
            {
                System.out.println(a[lrow][k]);
                count++;
                
                if(count == t_item) return;
            }
            lrow--;
            
            for(int k=lrow; k>=frow; k--)
            {   
                System.out.println(a[k][lcol]);
                count++;
                
                if(count == t_item) return;
            }
            lcol--;
            
            for(int k=lcol; k>=fcol; k--)
            {
                System.out.println(a[frow][k]);
                count++;
                
                if(count == t_item) return;
            }
            frow++;
        }
    }

}