import java.io.*;
import java.util.*;

public class Main {
    //leetcode submission
    public static void main(String[] args) throws Exception {
       Scanner scn = new Scanner(System.in);
       int x = scn.nextInt();
       int n = scn.nextInt();
       
       System.out.println(power(x,n));
    }

    public static int power(int x, int n){
        
        if(n==0)
            return 1; 
            
        int xpnb2 = power(x,n/2); // x pow n by 2
        int xn = xpnb2*xpnb2;
        
        if(n%2 == 1)
            xn*=x;
        
        return xn;
    }

}
//much more efficient method
// class Solution {
//     public double pow(double x, int n){
//         if(n == 0) return 1;
//         if(n == 1) return x;
//         if(n % 2 == 0)
//             return pow(x * x, n/2);
//         return x * pow(x * x, n/2);
//     }
//     public double myPow(double x, int n) {
//         if(n < 0)
//             return 1.0/pow(x, -n);
//         return pow(x, n);
//     }
// }
