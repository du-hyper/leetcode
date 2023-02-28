package dp.n1;

public class Solution {

    /**
     * 斐波拉契数列
     *
     * @param args
     */
    public static void main(String[] args) {
        long s = System.currentTimeMillis();

        System.out.println(dp2(15));

        long s1 = System.currentTimeMillis();
        System.out.println(s1 - s);

        System.out.println(recursion(15));

        long s2 = System.currentTimeMillis();
        System.out.println(s2 - s1);
    }

    /**
     * 递归
     */
    public static long recursion(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return recursion(n - 1) + recursion(n - 2);
    }

    /**
     * dp数组
     */
    public static long dp(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long[] nums = new long[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        return nums[n];
    }

    public static long dp2(int n) {
        int p = 0, q = 0, r = 1;
        for (int i = 1; i <= n; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
