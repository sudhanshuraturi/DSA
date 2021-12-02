// e.g.
// [(a + b) + {(c + d) * (e / f)}] -> true
// [(a + b) + {(c + d) * (e / f)]} -> false
// [(a + b) + {(c + d) * (e / f)} -> false
// ([(a + b) + {(c + d) * (e / f)}] -> false

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        Stack<Character> stk = new Stack<Character>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ')')
            {
                if(stk.size() == 0 || stk.peek() != '(')
                {
                    System.out.println("false");
                    return;
                }
                
                stk.pop();
            }
            
            else if(str.charAt(i) == '}')
            {
                if(stk.size() == 0 || stk.peek() != '{')
                {
                    System.out.println("false");
                    return;
                }
               
                stk.pop();
            }
            else if(str.charAt(i) == ']')
            {
                if(stk.size() == 0 || stk.peek() != '[')
                {
                    System.out.println("false");
                    return;
                }
                
                stk.pop();
            }
            else if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stk.push(str.charAt(i));
            }
        }
        
        if(stk.size()==0)
        System.out.println("true");
        else
        System.out.println("false");
    }

}