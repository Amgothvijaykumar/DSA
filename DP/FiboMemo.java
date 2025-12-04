package DP;

import java.util.*;

class FibMemo {
    static int fib(int n, Map<Integer, Integer> memo) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        int result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println("Fibonacci of " + n + " = " + fib(n, memo));
    }
}
