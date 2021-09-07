package com.company.medium.addtwonumbers;

class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode result = new ListNode(0);
    ListNode current = result;
    int addition = 0;
    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;
      int sum = addition + x + y;
      addition = sum / 10;
      current.next = new ListNode(sum % 10);
      current = current.next;
      if (l1 != null) l1 = l1.next;
      if (l2 != null) l2 = l2.next;
    }
    if (addition > 0) {
      current.next = new ListNode(addition);
    }
    return result.next;
  }
}
