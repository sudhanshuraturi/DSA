// Sample Input
// pepCODinG
// Sample Output
// PEPcodINg

import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
    	//where we are doing updations use string builder since no new objects will be made in each updation,
    	//in string every time we update new string object is made so more time complexity in string
    	
    	//in string we can use += for appending and toString() in return not required in string
    	StringBuilder ans = new StringBuilder();
    	
    	for(int i=0; i<str.length(); i++)
    	{
    	    if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
    	       ans.append((char)('a' + (str.charAt(i) -'A'))); 
    	    if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
    	       ans.append((char)('A' + (str.charAt(i) -'a')));
    	}
		return ans.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}