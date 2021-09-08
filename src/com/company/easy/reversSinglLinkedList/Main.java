package com.company.easy.reversSinglLinkedList;

import com.company.medium.addtwonumbers.ListNode;
import java.util.concurrent.ExecutionException;

public class Main {

  public static void main(String[] args) throws InterruptedException, ExecutionException {

    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4,null)));

    Solution solution = new Solution();
    ListNode listNode = solution.reverseListNodes(l2);
    while (listNode != null){
      System.out.println(listNode.val);
      listNode = listNode.next;
    }

  }
}
