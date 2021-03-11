package Study5;

public class Test01 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.dfs(10));
    }
}

class Solution {
    int dfs(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Math.min(dfs(n / 2) + n % 2, dfs(n / 3) + n % 3) + 1;
    }
}