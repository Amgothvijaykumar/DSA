package Recursion_problems;
import java.util.*;
public class GCD {
    static int gcd(int a, int b){
        if (b==0) return a;
        return gcd(b,a%b);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int res=gcd(a,b);
        System.out.println("GCD of "+a+" and "+b+" is: "+res);
        sc.close();
    } 
}
