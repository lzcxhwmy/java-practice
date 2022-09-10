package leetcode.aimToOffer.fib;

import java.util.HashMap;

public class fib {
    class Solution {
        private final HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
        public int fib(int n) {
            if (n == 0 || n == 1) return n;
            if (cache.containsKey(n)) return cache.get(n);
            int val = fib(n - 1) + fib(n - 2);
            cache.put(n, val);
            return val;
        }
    }

}


