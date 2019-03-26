package lang.StringSearch;

import java.util.ArrayList;
import java.util.List;

public class BFTest {
    /**
     *
     * Q:字符串匹配问题:在文本Source中找到模式Target出现的位置
     * 解决字符串匹配的算法包括：朴素算法（Naive Algorithm）、Rabin-Karp 算法、有限自动机算法（Finite Automation）、
     *      Knuth-Morris-Pratt 算法（即 KMP Algorithm）、Boyer-Moore 算法、Simon 算法、Colussi 算法、Galil-Giancarlo 算法
     *      Apostolico-Crochemore 算法、Horspool 算法、Shift-Or 算法和 Sunday 算法等
     *
     *
     *  BF（暴力）算法：
     *      首先S[1]和T[1]比较，
     *          若相等，则再比较S[2]和T[2]，一直到T[M]为止；
     *          若S[1]和T[1]不等，则T向 右移动一个字符的位置，再依次进行比较。
     *          如果存在k，1≤k≤N，且S[k+1…k+M]=T[1…M]，则匹配成功；否则失败。
     *          该算法最坏情况下要进行 M*(N-M+1)次比较，时间复杂度为O(M*N)
     *  BM(Boyer-Moore)算法：大多数的文本编辑器的查找功能，都是基于该算法
     *      （详见:https://www.cnblogs.com/gaochundong/p/boyer_moore_string_matching_algorithm.html）
     *      特点：
     *          1.BM算法会对target进行预处理
     *          2.预处理需要 O(m + σ) 的时间和空间复杂度
     *          3.匹配阶段需要 O(m + n) 的时间复杂度
     *          4.匹配阶段在最坏的情况下需要进行3n次字符比较
     *          5.最优复杂度是 O(n/m)
     *      BM算法的预处理，只针对于target，采用了2中不同的启发式方法：
     *          1.坏字符规则(Bad Character Heuristic):当Source中的某个字符与Target中的某个字符不匹配时，我们称Source中失配的字符为坏字符
     *          2.好后缀(Good Suffix Heuristic):当Source中的某个字符与Target中的某个字符匹配时，我们称Source中已经匹配的字符为好后缀
     *      在预处理时，将为两种不同的启发法结果创建不同的数组，分别称为
     *          Bad-Character-Shift（or The Occurrence Shift）和 Good-Suffix-Shift（or Matching Shift），分别存放坏字符和好后缀。
     *      在匹配阶段，左侧(头部)对齐，然后从target的尾部向头部进行比较，即从后向前比较。如果发现Source中的字符与Target中的字符不匹配时，将比较两种启发法所建议的位移长度，选取最大的值来对Target的比较位置进行滑动。
     *          1.字符不匹配
     *              坏字符启发法：模式后移位数=坏字符在模式中失配的位置-坏字符在模式中最后出现的位置
     *                  a)当坏字符不存在于模式中，则最后一次出现的位置为  -1
     *                  b)当坏字符在模式中最后出现的位置在失配位置的右侧时，该法则不提供建议
     *          2.字符匹配
     *              好后缀启发法：模式移位数=好后缀在模式中的当前位置-好后缀在模式中最右出现且前缀字符不同的位置
     *                  a)好后缀在模式中的当前位置以好后缀的最后一个字符的位置为准
     *                  b)如果好后缀在模式中只出现一次，即匹配过程中匹配到的字符，那么它的最优出现位置为-1
     *                  c)如果"好后缀"有多个，则除了最长的那个"好后缀"，其他"好后缀"的上一次出现位置必须在头部。
     *                      比如，假定"BABCDAB"的"好后缀"是"DAB"、"AB"、"B"，
     *                      请问这时"好后缀"的上一次出现位置是什么？
     *                      回答是，此时采用的好后缀是"B"，它的上一次出现位置是头部，即第0位。
     *                      这个规则也可以这样表达：如果最长的那个"好后缀"只出现一次，则可以把搜索词改写成如下形式进行位置计算"(DA)BABCDAB"，
     *                      即虚拟加入最前面的"DA"。
     *
     *      Boyer-Moore算法的基本思想是，每次后移这两个规则之中的较大值。
     *
     *
     */
    public static void main(String[] args) {
        String str = "12121212112";
        String str1 = "12";
        List<Integer> list = new ArrayList<>();
        list = BFIndex(str, str1,0,list);
        System.out.println("i======"+list);

    }
    static List BFIndex(String s,String t,int start,List<Integer> list ){
        int index;
        if(s.length() < 1 || t.length() < 1){
            return list;
        }
        int i = start;
        int j = 0;

        while (i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else {
                i=i-j+1;
                j=0;
            }
        }
        if(j == t.length()){
            index = i - t.length();
            list.add(index);

        }
        //当目标字符串中包含多个匹配字符串时，递归查询
        if(i<s.length() && j == t.length()){
            BFIndex(s,t,i-j+1,list);
        }
        return list;
    }
}
