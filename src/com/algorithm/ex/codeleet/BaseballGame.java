package com.algorithm.ex.codeleet;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> record = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                int last = record.pop();
                int newScore = last + record.peek();
                record.push(last);
                record.push(newScore);
            } else if (op.equals("D")) {
                record.push(2 * record.peek());
            } else if (op.equals("C")) {
                record.pop();
            } else {
                record.push(Integer.parseInt(op));
            }
        }

        int sum = 0;
        for (int score : record) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {
        BaseballGame game = new BaseballGame();

        String[] ops1 = {"5", "2", "C", "D", "+"};
        System.out.println(game.calPoints(ops1));  // 출력: 30

        String[] ops2 = {"5", "-2", "4", "C", "D", "9", "+", "+"};
        System.out.println(game.calPoints(ops2));  // 출력: 27

        String[] ops3 = {"1", "C"};
        System.out.println(game.calPoints(ops3));  // 출력: 0
    }
}
