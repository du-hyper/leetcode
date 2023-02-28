package dp.n5;

public class Solution {

    /**
     * 最长回文子串
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(force("aaaacc"));
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

}
