//     *
//   * * *
// * * * * *
//   * * *
//     *

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int stars = 1;
        int spaces = n/2;
        int flag = 0;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=spaces; j++)
                System.out.print("	");
            
            
            for(int k=1; k<=stars; k++)
                System.out.print("*	");
                
            
            System.out.println();
            
            if(flag==0)
            {
                stars+=2;
                spaces--;
            }
            else
            {
                stars-=2;
                spaces++;
            }
            
            if(stars==n)
                flag=1;
        }

    }
}