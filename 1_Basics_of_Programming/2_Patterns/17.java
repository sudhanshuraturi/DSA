//     *
//     * *
// * * * * *
//     * *
//     *
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        int spaces = n/2, stars = 1;   
        for(int i=0;i<n;i++)
        {
            for(int j=1; j<=spaces; j++)
                System.out.print("	");
            
            for(int j=1; j<=stars; j++)
            {   
                if(j>stars/2||i==n/2)
                    System.out.print("*	");
                else
                    System.out.print("	");
            }
            
            if(i<n/2)
            {
                spaces-=1;
                stars+=2;
            }
            else
            {
                spaces+=1;
                stars-=2;
            }
            System.out.println();
        }
    }
}