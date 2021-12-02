// You have to compress the given string in the following two ways - 
//   First compression -> 
//   The string should be compressed such that consecutive duplicates of characters 
//   are replaced with a single character.
   
//   For "aaabbccdee", the compressed string will be "abcde".
   
//   Second compression -> 
//   The string should be compressed such that consecutive duplicates of characters
//   are replaced with the character and followed by the number of consecutive duplicates.
   
//   For "aaabbccdee", the compressed string will be "a3b2c2de2".

import java.io.*;
import java.util.*;

public class Main {

	public static String compression1(String str){
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++)
		{
		    if(i==0 || (str.charAt(i) != str.charAt(i-1)))
		        sb.append(str.charAt(i));
		}
		return sb.toString();
	}

	public static String compression2(String str){
		
		StringBuilder sb = new StringBuilder();
		int counter = 0;
		for(int i=0;i<str.length();i++)
		{
		    if(i==0 || str.charAt(i) != str.charAt(i-1))
		    {  
		        if(counter > 1 && i > 0) //freq is of previous group is added
		            sb.append(counter);
		            
		        sb.append(str.charAt(i));
	            counter = 1;	        
		    }
		    else{
		        counter++;
		    }
		}
		
		if (counter > 1) sb.append(counter); //last group freq is explicitly added since each groups freq is added in next iteration i.e., iteration of next group
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}