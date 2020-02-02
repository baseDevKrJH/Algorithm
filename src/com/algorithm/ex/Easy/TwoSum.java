package com.algorithm.ex.Easy;

/**
 * Given nums = [ 2, 7, 11, 15 ], target = 9
 * nums[0] + nums[1] = 2 + 7 = 9,
 * return [ 0, 1 ]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result;
        result = twoSum(nums, target);

        for(int i =0; i<result.length; i++) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            target = target - nums[i];
            for(int j=i+1; j<nums.length; j++) {
                if(target == nums[j]) {
                    return new int[] { i, j };
                }
            }
        }



        return null;
    }
}
