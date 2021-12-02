
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        ArrayList<String> res = getStairPaths(n);
        System.out.println(res);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n<0)
        {
            ArrayList<String> paths = new ArrayList<>();
            return paths;
        }
        if(n==0)
        {
            ArrayList<String> paths = new ArrayList<>();
            paths.add("");
            return paths;
        }
        
        ArrayList<String> futurepaths1 = getStairPaths(n-1);
        ArrayList<String> futurepaths2 = getStairPaths(n-2);
        ArrayList<String> futurepaths3 = getStairPaths(n-3);
        
        ArrayList<String> res = new ArrayList<>();
        
        for(String s: futurepaths1)
            res.add(1+s);
        for(String s: futurepaths2)
            res.add(2+s);
        for(String s: futurepaths3)
            res.add(3+s);
        
        return res;
    }

}