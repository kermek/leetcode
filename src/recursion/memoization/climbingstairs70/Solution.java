package recursion.memoization.climbingstairs70;

import java.util.HashMap;

public class Solution {
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int climbStairs(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        }

        int result;
        if (n < 3) {
            result = n;
        } else {
            result = climbStairs(n - 2) + climbStairs(n - 1);
        }
        cache.put(n, result);
        return result;
    }
}
