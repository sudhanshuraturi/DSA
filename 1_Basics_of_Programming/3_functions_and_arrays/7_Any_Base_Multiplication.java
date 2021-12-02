import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
    int product = 1, num=0;
        while(n2>0)
        {
            int sdp = singleDigitMult(n1,n2%10,b);
            num = getSum(b,num,sdp*product); //do not write +=
            product*=10;
            n2/=10;
        }
        
        return num;
 }
 
 public static int singleDigitMult(int n1, int n2,int b){
     
     int carry = 0, product = 1, num=0;
        while(n1>0||carry>0)
        {
            int mul = ((n1%10) * (n2)) + carry;
            int digit = (mul)%b;
            carry = (mul)/b;
            num += (digit*product);
            product*=10;
            n1/=10;
        }
        
        return num;
 }
 
 public static int getSum(int b, int n1, int n2){
        
        int carry = 0, product = 1, num=0;
        while(n1>0||n2>0||carry>0)
        {
            int add = (n1%10) + (n2%10) + carry;
            int digit = (add)%b;
            carry = (add)/b;
            num += (digit*product);
            product*=10;
            n1/=10;
            n2/=10;
        }
        
        return num;
   }

}