package dp.n1414;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    /**
     * 和为K的最少斐波那契数字数目
     * @param args
     */
    public static void main(String[] args) {
        findMinFibonacciNumbers(30);
    }

    public static int findMinFibonacciNumbers(int k) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int n = 1;
        while(list.get(n) + list.get(n - 1) <= k) {
            list.add(list.get(n) + list.get(n - 1));
            n ++;
        }
        list.stream().forEach(e -> System.out.println(e));
        return 0;
    }

}
