package Leetcode.array;

import java.util.HashMap;

/**
 * @author wym
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1){
            return false;
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int n : nums) {
            if (hm.containsKey(n)) {
                return true;
            } else {
                hm.put(n, 1);
            }
        }

        return false;
    }

}
