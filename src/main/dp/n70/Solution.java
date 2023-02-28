package dp.n70;

public class Solution {

    /**
     * 爬楼梯
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(recursion(11));
        System.out.println(dp(11));
    }

    public static long recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return recursion(n - 1) + recursion(n - 2);
    }


    public static long dp(int n) {
        long p = 0, q = 0, r = 1;

        while (n > 0) {
            p = q;
            q = r;
            r = p + q;
            n--;
        }
        return r;
    }
}
