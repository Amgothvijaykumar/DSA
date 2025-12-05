//package DP;

import java.util.*;

class ClimbingWays {
    static int countWays(int n) {
        if (n < 0) return 0;    // no way to climb negative steps
        if (n == 0) return 1;   // one way to stay still

        int[] dp = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            // dp[i] = 0;
            if (i - 1 >= 0) dp[i] += dp[i - 1];
            if (i - 2 >= 0) dp[i] += dp[i - 2];
            if (i - 4 >= 0) dp[i] += dp[i - 4];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of stairs
        System.out.println(countWays(n));
    }
}
