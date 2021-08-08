package Work3.Task2;

/**
 *
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp = head;
        if(head==null){
            return null;
        }
        if (temp.val==val){//如果头节点就是要删除的节点，就直接以头结点的下一个节点当做头结点返回
            return head.next;
        }
        while (temp.next != null) {
            if(temp.next.val==val) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;

    }
}
