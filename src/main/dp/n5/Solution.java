package dp.n5;

public class Solution {

    /**
     * 最长回文子串
     *
     * @param args
     */
    public static void main(String[] args) {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            // 暴力解
            force("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("**************");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            // 第一次优化
            force2("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("**************");
        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            // 最终优化
            force3("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        }
        end = System.currentTimeMillis();
        System.out.println(end - start);
    }


    public static String force(String str) {
        String max = "" + str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            int p = i;
            int q = i;

            while (p > 0 && str.charAt(p - 1) == str.charAt(i)) {
                if (str.substring(p - 1, i + 1).length() > max.length()) {
                    max = str.substring(p - 1, i + 1);
                }
                p--;
            }

            while (q < str.length() - 1 && str.charAt(q + 1) == str.charAt(i)) {
                if (str.substring(i, q).length() > max.length()) {
                    max = str.substring(i, q);
                }
                q++;
            }

            p -= 1;
            q += 1;
            while (p >= 0 && q < str.length() && str.charAt(p) == str.charAt(q)) {
                if (str.substring(p, q + 1).length() > max.length()) {
                    max = str.substring(p, q + 1);
                }
                p--;
                q++;
            }
        }
        return max;
    }


    public static String force2(String str) {
        int start = 0, end = 0, len = 0;

        for (int i = 0; i < str.length(); i++) {

            int p = i;
            int q = i;

            while (p > 0 && str.charAt(p - 1) == str.charAt(i)) {
                int tempLen = i - (p - 1) + 1;
                if (tempLen > len) {
                    start = p - 1;
                    end = i;
                    len = tempLen;
                }
                p--;
            }

            while (q < str.length() - 1 && str.charAt(q + 1) == str.charAt(i)) {
                int tempLen = q + 1 - i;
                if (tempLen > len) {
                    start = i;
                    end = q;
                    len = tempLen;
                }
                q++;
            }

            p -= 1;
            q += 1;
            while (p >= 0 && q < str.length() && str.charAt(p) == str.charAt(q)) {
                int tempLen = q + 1 - p;
                if (tempLen > len) {
                    start = p;
                    end = q;
                    len = tempLen;
                }
                p--;
                q++;
            }
        }
        return str.substring(start, end + 1);
    }

    public static String force3(String str) {

        char[] strArray = str.toCharArray();
        int strLen = strArray.length;
        int start = 0, end = 0, len = 0;

        for (int i = 0; i < strLen; i++) {

            int p = i;
            int q = i;

            while (p > 0 && strArray[p - 1] == strArray[i]) {
                int tempLen = i - (p - 1) + 1;
                if (tempLen > len) {
                    start = p - 1;
                    end = i;
                    len = tempLen;
                }
                p--;
            }

            while (q < strLen - 1 && strArray[q + 1] == strArray[i]) {
                int tempLen = q + 1 - i;
                if (tempLen > len) {
                    start = i;
                    end = q;
                    len = tempLen;
                }
                q++;
            }

            p -= 1;
            q += 1;
            while (p >= 0 && q < strLen && strArray[p] == strArray[q]) {
                int tempLen = q + 1 - p;
                if (tempLen > len) {
                    start = p;
                    end = q;
                    len = tempLen;
                }
                p--;
                q++;
            }
        }
        return str.substring(start, end + 1);
    }
}
