package com.company.easy.reversSinglLinkedList;

import com.company.medium.addtwonumbers.ListNode;
import java.util.List;

public class Solution {
  public ListNode reverseListNodes(ListNode listNode){
    ListNode current = listNode;
    ListNode prev = null;
    while (current != null){
      ListNode nextNode = current.next;
      current.next = prev;
      prev = current;
      current = nextNode;
    }
    return prev;
  }
}
