package 剑指.剑指10斐波那契数列;

/**
 * @ClassName: Solution
 * @Description:
 * @Author: duc
 * @Date: 2022/3/3 2:56 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13
        Solution solution = new Solution();
        System.out.println(solution.fib(48));
    }


    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int mod = 1000000007;
        int d = 0;
        int p = 1;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (d + p) % mod;
            d = p;
            p = sum;
        }
        return sum;
    }
}
