package Recursion_problems;
import java.util.*;
public class ReverseString {

    public static void reverseString(char[] s,int left, int right){
        if (left>=right) return ;
        char temp=s[left];
        s[left++]=s[right];
        s[right--]=temp;
        reverseString(s,left, right);
        }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string to reverse:");
        String[] s=sc.nextLine().split(" ");

        for(int i=0; i<s.length; i++){
            char[] data=s[i].toCharArray();
            new ReverseString().reverseString(data, 0, data.length-1);
            System.out.print(data);
            
        }
        sc.close();
    }
}
