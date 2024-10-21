package com.algorithm.ex.codeleet;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();
        ListNode node = head;
        while(node != null) {
            arr.add(node);
            node = node.next;
        }
        node = head;
        for(int i = 0 ; i < arr.size()/2 ; i++) {
            ListNode ins = arr.get(arr.size()-i-1);
            ListNode insP = arr.get(arr.size()-i-2);
            insP.next = null;
            ListNode rn = node.next;
            node.next = ins;
            ins.next = rn;
            if(rn != null) node = rn;
        }
    }
    

    // 테스트용 메인 메서드
    public static void main(String[] args) {
        ReorderList solution = new ReorderList();

        // 테스트 케이스 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        solution.reorderList(head);
        printList(head);  // 출력: 1 -> 4 -> 2 -> 3

        // 테스트 케이스 2
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        solution.reorderList(head2);
        printList(head2);  // 출력: 1 -> 5 -> 2 -> 4 -> 3
    }

    // 연결 리스트 출력 함수
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}