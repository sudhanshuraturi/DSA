// 1
// 1   1
// 1   2   1
// 1   3   3   1
// 1   4   6   4   1
// 1   5   10  10  5  1

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int row=0; row<n; row++)
        {
            int value = 1;
            for(int col=0;col<=row;col++)
            {
                System.out.print(value+"\t");
                value = (value*(row-col))/(col+1);
            }
            System.out.println();
        }
        
        
    }
}