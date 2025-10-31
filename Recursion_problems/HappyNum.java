package Recursion_problems;
import java.util.*;
public class HappyNum {
    private static boolean isHappy(int n){
        if(n==1) return true;
        if(n==4) return false;

        return isHappy(sumOfDigits(n));
    }

    private static int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n=n/10;
        }
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isHappy(n)){
            System.out.println(n+" is a Happy Number");
        } else {
            System.out.println(n+" is not a Happy Number");
        }
        sc.close();
    }
}

