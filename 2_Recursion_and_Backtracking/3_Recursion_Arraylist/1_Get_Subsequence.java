import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        ArrayList<String> res = gss(str);
        System.out.println(res);
    
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length() == 0)
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        ArrayList<String> sres = gss(str.substring(1));//sres--small result i.e., faith
        ArrayList<String> res = new ArrayList<>();
        
        for(String s: sres) //either character is excluded
        {
           res.add(""+s); 
        }
        for(String s: sres) //or character is included
        {
            res.add(str.charAt(0)+s);
        }
        
        return res;
    }
    
    

}