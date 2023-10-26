package com.algorithm.ex.Easy;

/**
 * 지그재그로 숫자 출력하기
 *
 */
public class Zigzag {
    public static void main(String[] args) {
        int maxLine = 5;
        int num = 0;
        int lineNumber;

        for(lineNumber = 1; lineNumber <= maxLine; lineNumber++) {
            if(lineNumber % 2 == 0) {
                for(num = lineNumber * 5; num >= lineNumber * 5 -4; num--) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            } else {
                for(num = (5*(lineNumber-1)) + 1; num <= (5*(lineNumber-1))+5; num++) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
        }
    }
}
