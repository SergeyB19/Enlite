package com.example.Leetcode;

import java.util.Arrays;

public class SolutionPerimeter {
    public static void main(String[] args) {
        largestPerimeter(new int[]{2, 1, 2});
        largestPerimeter(new int[]{1, 2, 1});
        largestPerimeter(new int[]{3, 2, 3, 4});
        largestPerimeter(new int[]{3, 6, 2, 3});
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        for (int i = n - 3; i >= 0; i--) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                System.out.println(nums[i] + nums[i + 1] + nums[i + 2]);
                return nums[i] + nums[i + 1] + nums[i + 2];
            }

        }
        return 0;

       /* System.out.println(nums[n - 1] + nums[n - 2] + nums[n - 3]);

        return nums[n - 1] + nums[n - 2] + nums[n - 3];*/
    }

}
