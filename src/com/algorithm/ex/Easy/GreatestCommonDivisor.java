package com.algorithm.ex.Easy;

import java.util.Scanner;

/**
 * 두 수의 최대공약수 구하기
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int gcd = 0;
        int data;

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1 > num2) {
            data = num1;
        } else {
            data = num2;
        }

        for(int i=1; i<=data; i++) {
            if( (num1 % i == 0) && (num2 % i == 0) ) {
                gcd = i;
            }
        }

        System.out.println(gcd);

    }
}
