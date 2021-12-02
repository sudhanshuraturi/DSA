// 1
// 2 3
// 4 5 6
// 7 8 9 10



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(num+"	");
                num++;
            }
            System.out.println();
        }

    }
}