/*A company is building “green multipliers” where each product version is created 
by multiplying one or more approved multipliers from a fixed list of 
eco-certified numbers (which are primes).

The first version starts at 1.
Every next version must be the smallest number greater than the previous 
version that can be formed by multiplying these multipliers.

Find the N-th product version ID.


Input Format:
--------------
Line 1: An integer N — the version index to find (1-based).
Line 2: Space-separated integers — the approved multipliers (distinct primes).
(You may provide any count; the program infers the length from this line.)

Output Format:
--------------
A single integer: the N-th product version ID.

Sample Input-1:
---------------
12
2 7 13 19

Sample Output-1:
----------------
32

Explanation:
-------------
The first 12 powers are
1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32 -> the 12th power = 32.


Step 1: 
--------
Start the sequence
We always begin with
1
This is the base (we consider it the 1st element).

Step 2: 
--------
Multiply by each prime factor
We take 1 and multiply by each prime from the list:
    Prime	Result
    2	    2
    7	    7
    13	    13
    19	    19

Now we have these numbers: [1, 2, 7, 13, 19]

Step 3: 
--------
Continue the pattern
Now, take each of these numbers and multiply again by the primes.
Let’s multiply 2 by each prime:
2×2 = 4
2×7 = 14
2×13 = 26
2×19 = 38

Now multiply 7 by each prime:
7×2 = 14
7×7 = 49
7×13 = 91
7×19 = 133
…and so on.

Step 4: 
-------
Combine and sort
Combine everything (removing duplicates) and sort them:
1, 2, 4, 7, 8, 13, 14, 16, 19, 26, 28, 32, ...

Each of these numbers can be formed by multiplying some combination of {2, 7, 13, 19}.

Step 5: 
--------
Pick the 12th element
Now count the sequence:
Position	Value
---------  -------
1	        1
2	        2
3	        4
4	        7
5	        8
6	        13
7	        14
8	        16
9	        19
10	        26
11	        28
12	        32

Answer = 32


Sample Input-2:
---------------
1
2 3 5

Sample Output-2:
----------------
1

Explanation: 
-------------
1 has no prime factors, therefore all of its prime factors are in 
the array primes = [2,3,5].
*/

import java.util.*;



class nrhVersionID {
    private static long nthProduct(int n, int[] primes) {
        int k = primes.length;

        long[] dp = new long[n];
        dp[0] = 1;

        int[] idx = new int[k];              // all start at 0
        long[] next = new long[k];

        for (int i = 0; i < k; i++) {
            next[i] = primes[i];             // prime * dp[0]
        }

        for (int i = 1; i < n; i++) {
            long min = Long.MAX_VALUE;

            // find next candidate
            for (long val : next) {
                if (val < min) min = val;
            }

            dp[i] = min;

            // increment all idx whose candidate == min
            for (int j = 0; j < k; j++) {
                if (next[j] == min) {
                    idx[j]++;
                    next[j] = primes[j] * dp[idx[j]];
                }
            }
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) list.add(sc.nextInt());
        
        int[] primes = list.stream().mapToInt(i -> i).toArray();

        System.out.println(nthProduct(n, primes));
    }
}

