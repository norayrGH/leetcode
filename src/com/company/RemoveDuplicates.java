package com.company;

import java.util.LinkedList;
import org.w3c.dom.Node;

public class RemoveDuplicates {

  public static void main(String[] args) {
    var nodes = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(6)))));

    do {
      System.out.println(nodes.val);
      nodes = nodes.next;
    } while (nodes.next != null);
  }


  public ListNode deleteDuplicates(ListNode head) {

    return head;
  }

}
