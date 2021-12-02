import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
          Scanner scn = new Scanner(System.in);
        
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for(int i=0; i<n1; i++)
            a1[i] = scn.nextInt();
            
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for(int i=0; i<n2; i++)
            a2[i] = scn.nextInt();
            
        int n3 = n2;
        int[] a3 = new int[n3];
        
        int borrow = 0;
        n1--; n2--; n3--;
     
        while(n3>=0)
        {
            int diff= ((n2>-1 ? a2[n2]:0) - borrow) - (n1>-1 ? a1[n1]:0);
            
            if(diff<0)
            {
                diff += 10;
                borrow = 1;
            }
            else 
            {
                borrow = 0;
            }
            int digit = (diff)%10;
            a3[n3] = digit;
            n1--;
            n2--;
            n3--;
        }
        int i=0;
        while(a3[i]==0)
            i++;
        for(;i<a3.length;i++)
            System.out.println(a3[i]);
     
     }

}