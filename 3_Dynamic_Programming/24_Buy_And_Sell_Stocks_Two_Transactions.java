// 1. You are given a number n, representing the number of days.
// 2. You are given n numbers, where ith number represents price of stock on ith day.
// 3. You are required to print the maximum profit you can make if you are allowed two transactions at-most.
// Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int cost[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            cost[i] = scn.nextInt();    
        }
        
        int left_region[] = new int[n];
        int right[] = new int[n];
        
        int buyingDay = cost[0];
    
        //aaj ya aj se pehle becha ho to max profit
        for(int i=1; i<n; i++)
        {
            int current_profit = cost[i]-buyingDay;
            if(left_region[i-1] > current_profit)
                left_region[i] = left_region[i-1];
            else
                left_region[i] = current_profit;
            
            buyingDay = Math.min(cost[i],buyingDay);
        }
        
        int sellingDay = cost[n-1];
        
        //aaj ya aaj ke bad khareedna ho
        for(int i=n-2; i>=0; i--)
        {
            int current_profit = sellingDay - cost[i];
            
            if(right[i+1] > current_profit)
                current_profit = right[i+1];
                
            right[i] = current_profit;
            
            sellingDay = Math.max(cost[i],sellingDay);
        }
        
        int max = left_region[0] + right[0];
        for(int i=0; i<n; i++)
        {
            if(max < left_region[i] + right[i])
            {
                max = left_region[i] + right[i];
            }
        }
        
        System.out.println(max);
    }

}