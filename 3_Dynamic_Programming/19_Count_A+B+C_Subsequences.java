// 1. You are given a string str.
// 2. You are required to calculate and print the count of subsequences of the nature a+b+c+.
// For abbc -> there are 3 subsequences. abc, abc, abbc
// For abcabc -> there are 7 subsequences. abc, abc, abbc, aabc, abcc, abc, abc.

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int n = str.length();
        
        // x-> a+, y-> a+b+, z-> a+b+c+
        int x = 0, y = 0, z = 0;
        for(int i=1; i<=n; i++)
        {
            char ch = str.charAt(i - 1);
            int newX = x, newY = y, newZ = z;
            
            if(ch == 'a'){
                newX = 2*x + 1;    
            }
            else if(ch == 'b'){
                newY = 2*y + x;
            } 
            else if(ch == 'c'){
                newZ = 2*z + y;
            }
            
            x = newX; y = newY; z = newZ;
        }
        
        System.out.println(z);
    }
}