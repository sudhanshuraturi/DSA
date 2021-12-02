import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
         Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        ArrayList<String> res = getKPC(str);
        System.out.println(res);
    
    }

    static String[] keypad = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; 
    public static ArrayList<String> getKPC(String str) {
        
        if(str.equals("") == true)
        {
            ArrayList<String> res = new ArrayList<>();
            res.add("");
            return res;
        }
        
        ArrayList<String> sres = getKPC(str.substring(1));
        ArrayList<String> res = new ArrayList<>();
        
        char ch = str.charAt(0);
        
        for(int i=0; i<keypad[ch-'0'].length(); i++)
        {
            char letter = keypad[ch-'0'].charAt(i);
            
            for(String s:sres)
                res.add(letter+s);
        }
        
        return res;
    }

}