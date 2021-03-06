package 剑指.剑指53_II缺失的数字;

/**
 * @ClassName: Solution
 * @Description: 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * @Author: duc
 * @Date: 2022/3/2 11:58 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9};
        Solution solution = new Solution();
        int res = solution.missingNumber(array);
        System.out.println(res);
    }

    // 0 1 2 3
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int m = (i + j) / 2;
            if (nums[m] == m) {
                i = m + 1;
            } else {
                j = m - 1;
            }
        }
        return i;
    }
}
