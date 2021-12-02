import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int m = scn.nextInt();
        
        ArrayList<String> paths = getMazePaths(1,1,n,m);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc)
        {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(int ms=1; ms<=dc-sc; ms++)//ms-move size
        {   
            ArrayList<String> horizontalPaths = new ArrayList<>();
            horizontalPaths = getMazePaths(sr,sc+ms,dr,dc);
            for(String s: horizontalPaths)
            {
                paths.add("h"+ms+s);   
            }
        }
        
        for(int ms=1; ms<=dr-sr; ms++)
        {
            ArrayList<String> verticalPaths = new ArrayList<>();
            verticalPaths = getMazePaths(sr+ms,sc,dr,dc);
            for(String s: verticalPaths)
            {
                paths.add("v"+ms+s);
            }
        }
        
        for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++)
        {
            ArrayList<String> diagonalPaths = new ArrayList<>();
            diagonalPaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            for(String s: diagonalPaths)
            {
                paths.add("d"+ms+s);
            }
        }
        
        return paths;
  
    }

}