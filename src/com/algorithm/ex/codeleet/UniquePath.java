package com.algorithm.ex.codeleet;

public class UniquePath {
    public int uniquePath(int m, int n) {
        // dp 테이블 생성
        int[][] dp = new int[m][n];

        // 첫 번째 행과 첫 번째 열을 1로 초기화 (각 칸까지 도달하는 경로는 1개뿐)
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1; // 첫 열
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1; // 첫 행
        }

        // dp 테이블 채우기
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        // 오른쪽 아래 끝에 도달하는 경로의 수 반환
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        UniquePath solution = new UniquePath();
        int m = 3, n = 7;
        System.out.println("Unique paths: " + solution.uniquePath(m, n)); // 출력: 28
    }
}
