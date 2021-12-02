// Sample Input
// abcc
// Sample Output
// a
// b
// c
// cc
// c

import java.io.*;
import java.util.*;

public class Main {

    public static boolean isPallindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;
		while(left<right)
		{
		    if(str.charAt(left) != str.charAt(right))
		        return false;
		    left++;
		    right--;
		}
		
		return true;
    }
    
	public static void solution(String str){
		
		for(int i=0; i<str.length(); i++)
		{
		    for(int j=i; j<str.length(); j++)
		    {
		        String sub = str.substring(i,j+1);
		        if(isPallindrome(sub)==true)
		            System.out.println(sub);
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}