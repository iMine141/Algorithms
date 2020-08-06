package Leetcode.sort;

/**
 * @author wym
 */

/**
 * 快速排序
 */
public class QuickSort {

    public void quicksort(int[] nums, int low, int high){
        if (low < high){
            int p = quick(nums, low, high);
            quick(nums, low, p-1);
            quick(nums, p+1, high);
        }
    }

    public int quick(int[] nums, int low, int high){
        int partition = nums[low];

        while(low < high){
            while(high > low && nums[high] >= partition){
                high--;
            }
            if (high > low){
                nums[low] = nums[high];
                low++;
            }
            while(high > low && nums[low] <= partition){
                low++;
            }
            if (high > low){
                nums[high] = nums[low];
                high--;
            }
        }
        nums[low] = partition;
        return low;
    }
}
