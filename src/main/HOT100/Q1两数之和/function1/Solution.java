package HOT100.Q1两数之和.function1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @ClassName: Solution
 * @Description: 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * @Author: duc
 * @Date: 2022/2/28 5:07 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{2, 7, 11, 15};
        int[] res = solution.twoSum(array, 9);
        Arrays.stream(res).forEach(e -> System.out.println(e));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hashMap.containsKey(temp)) {
                return new int[]{hashMap.get(temp), i};
            }
            hashMap.put(nums[i], i);
        }
        return null;
    }
}
