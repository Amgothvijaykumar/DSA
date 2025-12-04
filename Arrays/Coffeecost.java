/*
 * A coffee chain is testing new drink blends.

You can pick:
One base drink (like espresso, mocha, latte)
Add-ons (milk, syrup, cream, etc.) where each can be added up to two times

Each base and add-on has its own cost.
Your job is to create a drink whose total cost is closest to a target price.
If multiple combinations are equally close, the lower price wins.

Input Format:
-------------
Line-1: Integer n                 // number of base drinks
Line-2: n space-separated ints    // costs of base drinks
Line-3: Integer m                 // number of add-on types
Line-4: m space-separated ints    // costs of add-ons
Line-5: Integer target            // target price

Output Format:
---------------
Line-1: Closest total cost to target (single integer)

Sample Input-1:
---------------
2
1 7
2
3 4
10

Sample Output-1:
----------------
10

Explanation: 
------------
Consider the following combination (all 0-indexed):
- Choose base 1: cost 7
- Take 1 of addon 0: cost 1 x 3 = 3
- Take 0 of addon 1: cost 0 x 4 = 0
Total: 7 + 3 + 0 = 10.

Sample Input-2:
---------------
2
2 3
3
4 5 100
18

Sample Output-2:
----------------
17

Explanation: 
-------------
Consider the following combination (all 0-indexed):
- Choose base 1: cost 3
- Take 1 of addon 0: cost 1 x 4 = 4
- Take 2 of addon 1: cost 2 x 5 = 10
- Take 0 of addon 2: cost 0 x 100 = 0
Total: 3 + 4 + 10 + 0 = 17. You cannot make a drink with a total cost of 18.

Sample Input-3:
---------------
2
3 10
2
2 5
9

Sample Output-3:
----------------
8

Explanation:
-------------
It is possible to make desserts with cost 8 and 10. Return 8 as it is the lower cost.




 */


import java.util.*;

public class Coffeecost {

    public static int closestDrinkCost(int[] baseCosts, int[] addonCosts, int target) {
        // generate all possible addon totals (each addon 0,1,2 times)
        Set<Integer> addonSums = new HashSet<>();
        generateAddonSums(addonCosts, 0, 0, addonSums);

        int best = Integer.MAX_VALUE;
        int bestDiff = Integer.MAX_VALUE;

        for (int base : baseCosts) {
            for (int add : addonSums) {
                int total = base + add;
                int diff = Math.abs(total - target);
                if (diff < bestDiff || (diff == bestDiff && total < best)) {
                    bestDiff = diff;
                    best = total;
                }
            }
        }
        return best;
    }

    private static void generateAddonSums(int[] addons, int idx, int current, Set<Integer> sums) {
        if (idx == addons.length) {
            sums.add(current);
            return;
        }
        for (int take = 0; take <= 2; take++) {
            generateAddonSums(addons, idx + 1, current + take * addons[idx], sums);
        }
    }

    // simple stdin driver matching the problem input format
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }

        int n = sc.nextInt();
        int[] base = new int[n];
        for (int i = 0; i < n; i++) base[i] = sc.nextInt();

        int m = sc.nextInt();
        int[] addons = new int[m];
        for (int i = 0; i < m; i++) addons[i] = sc.nextInt();

        int target = sc.nextInt();
        System.out.println(closestDrinkCost(base, addons, target));
        sc.close();
    }
}