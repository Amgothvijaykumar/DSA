package Recursion_problems;
import java.util.*;
public class Strobogrammatic {
    static char[][] digiPairs={{'1','1'},{'6','9'},{'8','8'},{'9','6'}};
    static List<String> isStrobogrammatic(int n){
        return helper(n,n);
    }

    static List<String> helper(int n, int m){
        if (n==0) return new ArrayList<String>(Arrays.asList(""));
        if (n==1) return new ArrayList<String>(Arrays.asList("0","1","8"));

        List<String> list=helper(n-2,m);
        List<String> res=new ArrayList<>();
        for(int i=0; i<list.size(); i++){
            String str=list.get(i);
            if(n!=m){
                res.add("0"+str+"0");
            }
            for(char[] pair:digiPairs){
                res.add(pair[0]+str+pair[1]);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<String> res=isStrobogrammatic(n);
        Collections.sort(res);
        System.out.println("Strobogrammatic numbers of length "+n+" are: ");
        System.out.println(res);
        sc.close();
    }
}
