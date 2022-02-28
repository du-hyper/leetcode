package 二分查找.Q35搜索插入位置.function1;

/**
 * @ClassName: Solution
 * @Description: 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 * @Author: duc
 * @Date: 2022/2/28 11:19 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] array = new int[]{1, 3};
        System.out.println(s.searchInsert(array, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] + 1 == target) {
                return mid + 1;
            } else if (nums[mid] - 1 == target) {
                return mid - 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            }
        }
        return 0;
    }
}
