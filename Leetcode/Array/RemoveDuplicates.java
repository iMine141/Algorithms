package Leetcode.Array;

/**
 * @author wym
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int i = 0;

        for (int j=1; j<nums.length; j++){
            if (nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int[] test = {1,1,2};
        int i = removeDuplicates.removeDuplicates(test);
    }
}