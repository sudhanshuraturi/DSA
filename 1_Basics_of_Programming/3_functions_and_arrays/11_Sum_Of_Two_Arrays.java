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
        
    int n3 = n1>n2?n1+1:n2+1;
    int[] a3 = new int[n3];
    
    int carry = 0;
    n1--; n2--; n3--;
    while(n1>=0||n2>=0||carry>0)
    {
        int add = (n1>-1 ? a1[n1]:0) + (n2>-1 ? a2[n2]:0) + carry;
        int digit = (add)%10;
        carry = (add)/10;
        a3[n3] = digit;
        n1--;
        n2--;
        n3--;
    }
    
    
    
    for(int i=0;i<a3.length;i++)
    {
        if(i==0&&a3[i]==0)
            continue;
            
        System.out.println(a3[i]);
    }
 }
    
    
}