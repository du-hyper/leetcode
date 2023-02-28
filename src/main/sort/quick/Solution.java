package sort.quick;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 2, 4, 10, 34, 55,  8};
//    9 2 4 8 34 55 8    10
//
        Arrays.stream(nums).forEach(e -> System.out.println(e));
    }

    public static void quickSort(int[] nums, int lo, int hi) {

        while (lo < hi) {
            int temp = nums[lo];
            int left = nums[lo];
            int right = nums[hi];
            if (temp > right) {
                nums[lo] = right;
                hi --;
            } else {
                lo ++;
            }
        }
    }
}
