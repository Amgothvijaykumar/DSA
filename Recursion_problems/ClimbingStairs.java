package Recursion_problems;
import java.util.*;
public class ClimbingStairs {
    static int climb(int n){
        if(n<=2) return n;
        return climb(n-1)+climb(n-2);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=climb(n);
        System.out.println("Number of ways to climb "+n+" stairs is: "+res);
        sc.close();

        
    }
}
