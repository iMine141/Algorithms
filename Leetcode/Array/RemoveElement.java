package Leetcode.Array;

/**
 * @author wym
 */

/**
 * 题目：27.移除元素
 * 描述：
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 */
public class RemoveElement {

    //暴力破解
    public int removeElement(int[] nums, int val) {
        int sum = nums.length;
        for (int i=nums.length-1; i>=0; i--){
            if (nums[i] == val){
                sum--;
                for (int j=i; j<nums.length-1; j++){
                    nums[j] = nums[j+1];
                }
            }
        }
        return sum;
    }

    //双指针
    public int removeElement1(int[] nums, int val){
        int j = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
