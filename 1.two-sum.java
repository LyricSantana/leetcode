/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if(numMap.containsKey(needed)) {
                return new int[] {numMap.get(needed), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[] {}; 
    }
}