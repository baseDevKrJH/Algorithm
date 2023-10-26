package com.algorithm.ex.Easy;

import java.util.Scanner;

/**
 * 두 수를 입력 받은 후,
 * 공통으로 해당되는 약수 구하기
 */
public class TwoNumCommonDivisor {
    public static void main(String[] args) {

        int gcd = 0;

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            gcd = num1;
        } else {
            gcd = num2;
        }

        for (int i = 1; i <= gcd; i++) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                System.out.println(i);
            }

            if ((i == num1) || (i == num2)) {
                break;
            }
        }


    }
}
