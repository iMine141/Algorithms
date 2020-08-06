package Leetcode.array;

/**
 * @author wym
 */

/**
 * H指数 II
 */
public class HIndex2 {
    public int hIndex2(int[] citations) {
        int length = citations.length;
        int left = 0;
        int right = length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(citations[mid] == length - mid){
                return length - mid;
            }if (citations[mid] < length - mid){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return length - left;
    }
}
