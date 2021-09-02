package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.naming.InvalidNameException;

public class Ab {

  private final List<ListNode> listNodeList;

  public Ab(List<ListNode> listNodeList) {
    this.listNodeList = listNodeList;
  }


  public List<ListNode> getListNodeList() {

    ArrayList<ListNode> listNodes = new ArrayList<>(listNodeList);
    ArrayList<Integer> result = new ArrayList<>();

    for (ListNode listNode : listNodes) {
      if (listNode.val > 0){
        result.add(listNode.val);
      }
    }

    List<Integer> collect = listNodes.stream()
        .map(listNode -> listNode.val)
        .filter(integer -> integer > 0)
        .collect(Collectors.toList());


    return listNodes;
  }
}
