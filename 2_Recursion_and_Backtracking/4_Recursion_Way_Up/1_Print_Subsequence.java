import java.io.*;
import java.util.*;

public class Main {
    //do check 2 submissions for this question
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        String output= "";
        printSS(input,0,output);
    }

    public static void printSS(String input, int idx, String output) {

        if(idx == input.length())
        {
            System.out.println(output);
            return;
        }
        
        char ch = input.charAt(idx);
        printSS(input,idx+1,output+ch);
        printSS(input,idx+1,output);
        
    }

}