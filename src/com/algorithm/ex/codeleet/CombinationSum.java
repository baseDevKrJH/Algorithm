package com.algorithm.ex.codeleet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // 결과를 저장할 리스트
        List<List<Integer>> result = new ArrayList<>();
        // 백트래킹 시작
        findCombinations(candidates, target, result, new ArrayList<>(), 0);
        return result;
    }

    // 재귀적 백트래킹 메서드
    private void findCombinations(int[] candidates, int target, List<List<Integer>> result, List<Integer> currentList, int start) {
        // 목표 값에 도달하면 현재 리스트를 결과에 추가
        if (target == 0) {
            result.add(new ArrayList<>(currentList));
            return;
        }

        // 모든 후보 숫자에 대해 재귀적으로 탐색
        for (int i = start; i < candidates.length; i++) {
            // 만약 현재 숫자가 남은 목표보다 크면 종료
            if (candidates[i] > target) {
                continue;
            }
            // 현재 숫자를 선택
            currentList.add(candidates[i]);
            // 선택한 숫자를 다시 사용할 수 있도록 자기 자신부터 재귀 호출
            findCombinations(candidates, target - candidates[i], result, currentList, i);
            // 백트래킹을 위해 마지막으로 추가한 숫자를 제거
            currentList.remove(currentList.size() - 1);
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        // 예시 1
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(cs.combinationSum(candidates1, target1));
        // 출력: [[2, 2, 3], [7]]

        // 예시 2
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println(cs.combinationSum(candidates2, target2));
        // 출력: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

        // 예시 3
        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println(cs.combinationSum(candidates3, target3));
        // 출력: []
    }
}
