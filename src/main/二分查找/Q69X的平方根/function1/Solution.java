package 二分查找.Q69X的平方根.function1;

/**
 * @ClassName: Solution
 * @Description: 给你一个非负整数 x ，计算并返回x的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * 注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。
 * @Author: duc
 * @Date: 2022/3/1 10:54 AM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(2147395599));
    }

    public int mySqrt(int x) {
        int left = 0, right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long ans = (long) mid * mid;
            long ans2 = (long) (mid + 1) * (mid + 1);
            if (ans == x) {
                return mid;
            } else if (ans < x && ans2 > x) {
                return mid;
            } else if (ans < x) {
                left = mid + 1;
            } else if (ans > x) {
                right = mid - 1;
            }
        }
        return 0;
    }
}
