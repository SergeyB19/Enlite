package com.example.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

public class Solution {
    public static void main(String[] args) {
        int[] i = new int[]{2, 7, 11, 15};
        twoSum(i, 9);
        twoSumMap(i, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{};
    }

    public static int[] twoSumMap(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }

        }
        return new int[]{};
    }
}
