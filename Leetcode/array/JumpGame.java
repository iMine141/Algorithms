package Leetcode.array;

/**
 * @author wym
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        int max = 0;

        for (int i=0; i<nums.length; i++){
            int tmp = nums[i];
            if (max < i) {
                return false;
            }
            max = Math.max(max, tmp+i);
        }
        return true;
    }
}
