//     1
//   2 3 2
// 3 4 5 4 3
//   2 3 2
//     1


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

         int n = scn.nextInt();
    
        int spaces = n/2, stars = 1, count = 1;   
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=spaces; j++)
                System.out.print("	");
            
            
            int temp = count;    
            for(int j=1; j<=stars; j++)
            {   
                System.out.print(temp+"	");
                if(j<=stars/2)
                    temp++;
                else
                    temp--;
            }
            
            if(i<=n/2)
            {
                spaces-=1;
                stars+=2;
                count++;
            }
            else
            {
                spaces+=1;
                stars-=2;
                count--;
            }
            System.out.println();
        }
    }
}