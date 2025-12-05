import java.util.*;

public class FrogJumps {

    // Recursive + Memoization DP function
    static int MinEnergy(int[] heights, int ind, int[] dp) {
        if (ind == 0) return 0; // Base case
        if (dp[ind] != -1) return dp[ind];

        // Jump from previous stair
        int left = MinEnergy(heights, ind - 1, dp) + Math.abs(heights[ind] - heights[ind - 1]);

        // Jump from two stairs before (if possible)
        int right = Integer.MAX_VALUE;
        if (ind > 1) {
            right = MinEnergy(heights, ind - 2, dp) + Math.abs(heights[ind] - heights[ind - 2]);
        }

        // Store and return minimum energy
        return dp[ind] = Math.min(left, right);
    }

    static int frogJumpings(int n, int[] heights) {
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        return MinEnergy(heights, n - 1, dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of stairs: ");
        int n = sc.nextInt();

        int[] heights = new int[n];
        System.out.println("Enter heights of stairs:");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int result = frogJumpings(n, heights);
        System.out.println("Minimum total energy: " + result);

        sc.close();
    }
}
// Enter number of stairs: 4
// Enter heights of stairs:
// 10 20 30 10
// Minimum total energy: 20