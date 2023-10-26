package com.algorithm.ex.Easy;

import java.util.Scanner;

/**
 * 입력 받은 수의 약수 구하기
 */
public class OneNumCommonDivisorAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for(int i=1; i<=num1; i++) {
            if((num1 % i) == 0) {
                System.out.println(i);
            }
        }
    }
}
