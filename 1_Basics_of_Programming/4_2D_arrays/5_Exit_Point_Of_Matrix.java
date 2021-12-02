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
        
        int direction=0;//east 0 south 1 west 2 north 3
        int row=0,col=0;
        
        while(row<n && row>=0 && col<m && col>=0)
        {
            //direction update
            if(a[row][col] == 1)
            {
                direction = (direction+1)%4;
            }
            
            //move one step
            if(direction == 0)
            {
                col++;
            }
            else if(direction == 1)
            {
                row++;
            }
            else if(direction == 2)
            {
                col--;
            }
            else
            {
                row--;
            }
        }
        
        if(direction == 0) //exited while moving east
            {
                System.out.println(row+"\n"+(col-1));
            }
        else if(direction == 1) //exited while moving south
            {
                System.out.println((row-1)+"\n"+col);
            }
        else if(direction == 2)
            {
                System.out.println(row+"\n"+(col+1));
            }
        else
            {
                System.out.println((row+1)+"\n"+col);
            }
       
        
        /*or
         if(row == n)    
            row--;
        if(col == m)
            col--;
    
        if(row==-1)
            row++;
        if(col==-1)
            col++;
        System.out.println(row+"\n"+col);
        */
            
        
    }

}