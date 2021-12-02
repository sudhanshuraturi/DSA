// 0
// 1   1
// 2   3   5
// 8   13  21  34


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0,b=1,c;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a+"	");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }

    }
}