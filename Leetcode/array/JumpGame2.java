package Leetcode.array;

/**
 * @author wym
 */
public class JumpGame2 {
    public static void main(String[] args) {
        // int[] arr = {2,3,1,1,4};
        // int[] arr = {1,1,1,1,1};
        int[] arr = {5,9,3,2,1,0,2,3,3,1,0,0};
        JumpGame2 jumpGame2 = new JumpGame2();
        jumpGame2.jump(arr);
    }
    public int jump(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

}

