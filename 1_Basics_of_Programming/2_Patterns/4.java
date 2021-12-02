// * * * * *
//   * * * *
//     * * *
//       * *
//         *

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int stars = n;
        int spaces = 0;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=spaces; j++)
                System.out.print("	");
            
            
            for(int k=1; k<=stars; k++)
                System.out.print("*	");
                
            
            System.out.println();
            stars--;
            spaces++;
            
        }

    }
}