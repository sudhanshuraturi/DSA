// 1. You are given an ArrayList of positive integers.
// 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

// Note -> The order of elements should remain same.

import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		
		// Loop from right to left: to avoid skipping elements
        for(int idx = al.size()-1; idx >= 0; idx--)
		{
		    if(isPrime(al.get(idx)))
		        al.remove(idx); 
		}
		
	}
	
	public static boolean isPrime(int val)
    {
        for(int i = 2; i * i <= val; i++) //check if = comes
        {
            if(val % i == 0) return false;
        }
        return true;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}