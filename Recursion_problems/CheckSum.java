package Recursion_problems;
import java.util.*;
public class CheckSum {
    static int Check(int n){
       if(n<10) return n;
       return Check(Multi(n));
    }
    
    static int Multi(int n){
        int s=1;
        while(n>0){
            s=s*(n%10);
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(Check(n));
        sc.close();
    }
    
}
