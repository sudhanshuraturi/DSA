// * * *    * * *
// * *        * *
// *            *
// * *        * *
// * * *    * * *


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int stars =  (n/2)+1;
        int spaces = 1;
        int flag = 0;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=stars; j++)
                System.out.print("*	");
            
            
            for(int k=1; k<=spaces; k++)
                System.out.print("	");
            
            for(int j=1; j<=stars; j++)
                System.out.print("*	");
               
            
            System.out.println();
            
            if(flag==0)
            {
                spaces+=2;
                stars--;
            }
            else
            {
                spaces-=2;
                stars++;
            }
            
            if(spaces==n)
                flag=1;
        }

    }
}