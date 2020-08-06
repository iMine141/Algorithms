package Leetcode.array;

import java.util.Arrays;

/**
 * @author wym
 */
public class HIndex {
    public int hIndex(int[] citations) {
        //排序
        Arrays.sort(citations);

        int i = 0;
        while (i < citations.length && citations[citations.length - 1 - i] > i) {
            i++;
        }
        return i;
    }
}
