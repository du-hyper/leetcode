package 二分查找.Q704二分查找.function;

/**
 * @ClassName: Solution
 * @Description: 给定一个n个元素有序的（升序）整型数组nums 和一个目标值target ，写一个函数搜索nums中的 target，如果目标值存在返回下标，否则返回 -1。
 * @Author: duc
 * @Date: 2022/2/28 10:46 PM
 * @Version: V1.0
 **/
public class Solution {

    // -1, 2, 4, 6, 7, 9, 11          5
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        Solution solution = new Solution();
        int res = solution.search(nums, 9);
        System.out.println(res);
    }

    public int search(int[] nums, int target) {
        // 定义初始左右边界
        int left = 0, right = nums.length - 1;
        // 当左右边界无交叉时，循环搜索
        while (left <= right) {
            // 本次搜索的中点，5-10的中点计算方法，[(10 - 5) / 2] + 5
            int mod = left + (right - left) / 2;
            // 当搜索到的中点值与target不相等时，左右指针按条件向左或向右拨动1，目的是跳过本次匹配的值，然后继续下轮二分搜索
            if (nums[mod] > target) {
                right = mod - 1;
            } else if (nums[mod] < target) {
                left = mod + 1;
            } else {
                return mod;
            }
        }
        return -1;
    }
}
