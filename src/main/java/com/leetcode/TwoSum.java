package com.leetcode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * 两数之和
 */
public class TwoSum {

    //最笨的方法 暴力法
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //方法二：引入哈希表

    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            int curr = target-nums[i];
            if(map.containsKey(curr)){
                return new int[]{map.get(curr),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
