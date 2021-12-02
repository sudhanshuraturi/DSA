// *  *  *  *  *  *  * 
//    *           *
//       *     *
//          *
//       *  *  *
//    *  *  *  *  *
// *  *  *  *  *  *  *

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     int stars = n;
     int spaces = 0;
     
     for(int i=0;i<n;i++)
     {
         for(int j=1;j<=spaces;j++)
         { 
             System.out.print("\t");
         }    
         for(int j=1;j<=stars;j++)
         {      
             if(i>0&&i<n/2&&j!=1&&j!=stars)
                System.out.print("\t");
             else
                System.out.print("*\t");
         }    
        System.out.println();
        
        if(i<n/2)
        {
            spaces++;
            stars-=2;
        }
        else
        {
            spaces--;
            stars+=2;
        }
     }

 }
}