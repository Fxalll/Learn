package Study5;

import java.util.HashMap;
import java.util.Map;

class Test02{
    public static void main(String[] args) {
        Solution01 solution01 = new Solution01();
        System.out.println(solution01.minDays(100));
    }
}

class Solution01 {

    private Map<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        if(n == 0)
            return 0;
        if(!map.containsKey(n)) {
            int ans = n;
            int half = n / 2;
            int third = n / 3;
            ans = Math.min(ans, minDays(half) + 1 + n - 2 * half);
            ans = Math.min(ans, minDays(third) + 1 + n - 3 * third);
            map.put(n, ans);
        }
        return map.get(n);
    }
}