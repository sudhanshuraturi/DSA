// For "abecd", the answer should be "a1b3e-2c1d", as 
//   'b'-'a' = 1
//   'e'-'b' = 3
//   'c'-'e' = -2
//   'd'-'c' = 1

import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String str){
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
		    ans.append((char)(str.charAt(i)));
		    
		    if(i != str.length()-1)
		        ans.append(str.charAt(i+1)-str.charAt(i));
		}

		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}