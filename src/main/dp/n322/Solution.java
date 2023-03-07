package dp.n322;

import java.util.Arrays;

public class Solution {

    /**
     * 零钱兑换
     *
     * @param args
     */
    public static void main(String[] args) {
//        int[] coins = new int[]{186, 419, 83, 408};
//        System.out.println(coinChange(coins, 6249));

        int[] coins = new int[]{1, 3, 5};
        System.out.println(coinChange(coins, 11));
    }

    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        int count = recursion(coins, amount);
        if (count == 0) {
            return -1;
        }
        return count;
    }


    public static int recursion(int[] coins, int amount) {
        System.out.println(amount);
        if (amount < 0) {
            return 0;
        }
        if (amount == 0) {
            return 1;
        }
        int count = 0;
        for (int i = coins.length - 1; i >= 0; i--) {
            count += recursion(coins, amount - coins[i]);
        }
        return count;
    }
}
