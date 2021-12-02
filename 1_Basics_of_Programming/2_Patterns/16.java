// 1           1
// 1 2       2 1
// 1 2 3   3 2 1
// 1 2 3 4 3 2 1

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int spaces = 2*n-3, stars = 1;
    
    for(int row = 1; row<= n; row++)
    {
        int num = 1;
        
        for(int j=1; j<=stars; j++)
        {    System.out.print(num+"	");
             num++;
        }    
        for(int k=1; k<=spaces; k++)
            System.out.print("	");
        
        if(row==n) 
        {
         stars--;
         num-=2;
        }
        else num--;
        
        for(int l=1; l<=stars; l++)
        {   
            System.out.print(num+"	");
            num--;
        }
        stars++;
        spaces-=2;
        
        
            
        System.out.println();    
        
    }

 }
}