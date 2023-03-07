package dp.n118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    /**
     * 杨辉三角
     *
     * @param args
     */
    public static void main(String[] args) {
        List<List<Integer>> res = generate1(5);
        res.forEach(e -> {
            e.forEach(s -> System.out.print(s));
            System.out.println();
        });
    }

    /**
     * 暴力解
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(1);
                res.add(list);
            } else {
                List<Integer> pre = res.get(i - 1);
                int len = pre.size();
                List<Integer> _this = new ArrayList<>();
                for (int j = 0; j <= len; j++) {
                    if (j == 0 || j == len) {
                        _this.add(1);
                    } else {
                        _this.add(pre.get(j) + pre.get(j - 1));
                    }
                }
                res.add(_this);
            }
        }
        return res;
    }

    /**
     * 优化1
     */
    public static List<List<Integer>> generate1(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows > 0) {
            res.add(Arrays.asList(1));
        }
        if (numRows > 1) {
            res.add(Arrays.asList(1, 1));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> pre = res.get(i - 1);
            List<Integer> _this = new ArrayList<>();
            for (int j = 0; j <= pre.size(); j++) {
                if (j == 0 || j == pre.size()) {
                    _this.add(1);
                } else {
                    _this.add(pre.get(j) + pre.get(j - 1));
                }
            }
            res.add(_this);
        }
        return res;
    }
}
