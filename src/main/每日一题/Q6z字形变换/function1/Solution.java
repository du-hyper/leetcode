package 每日一题.Q6z字形变换.function1;

/**
 * @ClassName: Solution
 * @Description: 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行Z 字形排列。
 * 比如输入字符串为 "
 * "行数为 3 时，排列如下：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。
 * @Author: duc
 * @Date: 2022/3/1 11:37 AM
 * @Version: V1.0
 **/
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.convert("PAHNAPLSIIGYIR", 3);
    }

    public String convert(String s, int numRows) {
        int x = s.length() / (2 * numRows - 2) + 1;
        Character[][] array = new Character[x][numRows];
        int pos = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < numRows; j++) {
                array[j][i] = s.charAt(pos);
            }
        }
        return null;
    }
}
