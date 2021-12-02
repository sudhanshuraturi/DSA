
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
        
        ArrayList<String> verticalPaths = new ArrayList<>();
        ArrayList<String> horizontalPaths = new ArrayList<>();
        
        if(sc<dc)
        {   
            horizontalPaths = getMazePaths(sr,sc+1,dr,dc);
        }
        
        if(sr<dr)
        {
            verticalPaths = getMazePaths(sr+1,sc,dr,dc);
        }
        
        ArrayList<String> paths = new ArrayList<>();
        
        for(String s: horizontalPaths)
            {
                paths.add("h"+s);   
            }
        for(String s: verticalPaths)
            {
                paths.add("v"+s);
            }
        
            
        return paths;
    }

}