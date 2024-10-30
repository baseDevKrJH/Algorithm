package com.algorithm.ex.codeleet;

import java.util.LinkedList;
import java.util.Queue;

public class Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        // 학생들의 선호도를 큐로 변환
        Queue<Integer> studentQueue = new LinkedList<>();
        for (int student : students) {
            studentQueue.offer(student);
        }

        // 샌드위치 스택 인덱스
        int sandwichIndex = 0;
        int count = 0; // 학생들이 더 이상 먹을 수 없을 때를 추적하는 변수

        // 큐가 비어있지 않고, 샌드위치를 가져가는 학생이 있을 동안 반복
        while (!studentQueue.isEmpty() && count < studentQueue.size()) {
            // 현재 학생이 맨 위 샌드위치를 선호하는 경우
            if (studentQueue.peek() == sandwiches[sandwichIndex]) {
                studentQueue.poll(); // 학생이 샌드위치를 가져가고 줄에서 나옴
                sandwichIndex++; // 다음 샌드위치로 이동
                count = 0; // 카운트 리셋 (성공적으로 먹었으므로)
            } else {
                // 학생이 샌드위치를 원하지 않으면 줄의 끝으로 이동
                studentQueue.offer(studentQueue.poll());
                count++; // 먹지 못한 횟수 증가
            }
        }

        // 줄에 남은 학생 수를 반환 (먹지 못한 학생 수)
        return studentQueue.size();
    }

    public static void main(String[] args) {
        Lunch solution = new Lunch();

        // 테스트 케이스 1
        int[] students1 = {1, 1, 0, 0};
        int[] sandwiches1 = {0, 1, 0, 1};
        System.out.println(solution.countStudents(students1, sandwiches1)); // 결과: 0

        // 테스트 케이스 2
        int[] students2 = {1, 1, 1, 0, 0, 1};
        int[] sandwiches2 = {1, 0, 0, 0, 1, 1};
        System.out.println(solution.countStudents(students2, sandwiches2)); // 결과: 3
    }
}
