package 剑指.剑指50第一个只出现一次的字符;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: Solution
 * @Description: 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * @Author: duc
 * @Date: 2022/3/3 3:35 PM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("abaccdeff"));
    }

    // aaaeefggg ### 排序字符可以使用快慢指针
    public char firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return ' ';
    }

    // aaaeefggg ### 排序字符可以使用快慢指针
    public char firstUniqChar1(String s) {
        int p = 0, ps = 0, size = s.length();
        while (ps < size) {
            if (s.charAt(p) != s.charAt(ps) && ps - p == 1) {
                return s.charAt(p);
            } else if (s.charAt(p) != s.charAt(ps) && ps - p > 1) {
                p = ps;
            }
            ps++;
        }
        return ' ';
    }
}
