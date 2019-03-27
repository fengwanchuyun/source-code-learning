package lang.StringSearch;

public class BoyerMooreSearch {
    //实现1
//    //注意此处right[]的构造
////    public static void getRight(String pat, int[] right) {
////        for (int i = 0; i < 256; i++) {
////            right[i] = -1;
////        }
////        for (int j = 0; j < pat.length(); j++) {
////            char c = pat.charAt(j);
////            System.out.println(c);
////            right[c] = j;
////        }
////    }
////
////    public static int Search(String txt, String pat, int[] right) {
////        int M = txt.length();
////        int N = pat.length();
////        int skip;
////        for (int i = 0; i <= M - N; i += skip) {
////            skip = 0;
////            for (int j = N - 1; j >= 0; j--) {
////                if (pat.charAt(j) != txt.charAt(i + j)) {
////                    skip = j - right[txt.charAt(i + j)];
////                    if (skip < 1)
////                        skip = 1;
////                    break;
////                }
////            }
////            if (skip == 0)
////                return i;
////        }
////        return -1;
////    }
////
////    public static void main(String[] args) {
////        String txt = "THIS IS A BIG TIGER";
////        String pat = "ER";
////        int[] right = new int[256];
////        getRight(pat, right);
////        int search = Search(txt, pat, right);
////        System.out.println(search);
////    }
    //实现2

    /**
     * 初始化坏字符数组
     * @param pattern
     * @return
     */
    public static int[] build_bad_table(String pattern) {
        final int table_size = 256;
        int[] bad_table = new int[table_size];
        int pLen = pattern.length();

        for (int i = 0; i < bad_table.length; i++) {
            bad_table[i] = pLen;  //默认初始化全部为匹配字符串长度
        }
        for (int i = 0; i < pLen; i++) {
            int k = pattern.charAt(i);
            bad_table[k] = pLen - 1 - i;
        }
        return bad_table;
    }

    //TODO 一定要把这块搞懂了
    /**
     * 初始化好后缀数组
     * @param pattern
     * @return
     */
    public static int[] build_good_table(String pattern) {
        int pLen = pattern.length();
        int[] good_table = new int[pLen];
        int lastPrefixPosition = pLen;

        for (int i = pLen - 1; i >= 0; --i) {
            if (isPrefix(pattern, i + 1)) {
                lastPrefixPosition = i + 1;
            }
            good_table[pLen - 1 - i] = lastPrefixPosition - i + pLen - 1;
        }

        for (int i = 0; i < pLen - 1; ++i) {
            int slen = suffixLength(pattern, i);
            good_table[slen] = pLen - 1 - i + slen;
        }
        return good_table;
    }

    /**
     * 前缀匹配
     */
    private static boolean isPrefix(String pattern, int p) {
        int patternLength = pattern.length();
        for (int i = p, j = 0; i < patternLength; ++i, ++j) {
            if (pattern.charAt(i) != pattern.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 后缀匹配
     */
    private static int suffixLength(String pattern, int p) {
        int pLen = pattern.length();
        int len = 0;
        for (int i = p, j = pLen - 1; i >= 0 && pattern.charAt(i) == pattern.charAt(j); i--, j--) {
            len += 1;
        }
        return len;
    }

    /**
     * 算法匹配
     */
    public static int pattern(String pattern, String target) {
        int tLen = target.length();
        int pLen = pattern.length();

        if (pLen > tLen) {
            return -1;
        }

        int[] bad_table = build_bad_table(pattern);// 1,3,5,6,2,
        int[] good_table = build_good_table(pattern);// 1,8,5,10,11,12,13

        for (int i = pLen - 1, j; i < tLen;) {
            System.out.println("跳跃位置：" + i);
            for (j = pLen - 1; target.charAt(i) == pattern.charAt(j); i--, j--) {
                if (j == 0) {
                    System.out.println("匹配成功，位置：" + i);
                    return i;
                }
            }
            i += Math.max(good_table[pLen - j - 1], bad_table[target.charAt(i)]);
        }
        return -1;
    }


    public static void main(String[] args) {
        String txt = "THIS IS A BIIG TIGER";
        String pat = "GER";
        int pattern = pattern(pat, txt);
        System.out.println(pattern);
    }

}
