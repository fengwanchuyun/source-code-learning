package util;

public class HashMapTest {

    /**
     * 定位哈希桶数组索引位置
     * //它通过 “(table.length -1) & h” 来得到该对象的索引位置，这个优化是基于以下公式：x mod 2^n = x & (2^n - 1)。
     *     // 我们知道HashMap底层数组的长度总是2的n次方，并且取模运算为“h mod table.length”，
     *     // 对应上面的公式，可以得到该运算等同于“h & (table.length - 1)”。
     *     // 这是HashMap在速度上的优化，因为&比%具有更高的效率。
     */
}
