package com.algorithm.ex.codeleet;

import java.util.Arrays;

public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        // 배열을 오름차순으로 정렬
        Arrays.sort(nums);

        int sum = 0;

        // 정렬된 배열에서 짝수 인덱스 값들을 모두 더함
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        ArrayPartition solution = new ArrayPartition();

        // 테스트 케이스
        int[] nums = {1, 4, 3, 2};
        System.out.println(solution.arrayPairSum(nums));  // 결과: 4

        int[] nums2 = {6, 2, 6, 5, 1, 2};
        System.out.println(solution.arrayPairSum(nums2));  // 결과: 9
    }
}
