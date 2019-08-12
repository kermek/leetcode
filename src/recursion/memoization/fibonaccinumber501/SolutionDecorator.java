package recursion.memoization.fibonaccinumber501;

import java.util.HashMap;

public class SolutionDecorator {
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib(int N) {
        if (cache.containsKey(N)) {
            return cache.get(N);
        }

        int result = fibN(N);
        cache.put(N, result);
        return result;
    }

    public int fibN(int N) {
        if (N < 2) {
            return N;
        }
        return fib(N - 2) + fib(N - 1);
    }
}