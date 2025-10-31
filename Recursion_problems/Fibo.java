package Recursion_problems;

import java.util.*;
public class Fibo {
    static int fibonacci(int n){
        if(n<=1) return 1;
        if (n==2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=fibonacci(n);
        System.out.println("Fibonacci number at position "+n+" is: "+res);
        sc.close();
    }
    
}
