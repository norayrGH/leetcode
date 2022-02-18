package com.company.easy.mergetwosortedlists;


public class ListNode {

  int val;
  ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }
}

class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode result = list1.val >= list2.val ? list1 : list2;
    do {
      list1 = list1.next;
      ListNode list1Current = list1;
      if (list1Current.val >= result.val) {
      } else {

      }

    } while (list1.next == null || list2.next == null);
    return null;
  }

}

