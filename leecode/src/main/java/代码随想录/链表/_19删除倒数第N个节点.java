package 代码随想录.链表;

import java.util.List;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-14 15:50
 * @description：  双节点
 */
public class _19删除倒数第N个节点 {
    public static void main(String[] args) {
        ListNode listNode = getNode();
        System.out.println(removeNthFromEnd(listNode,2));


    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0,head);
        ListNode cur = head;
        for (int i = 0; i < n-1; i++) {
            if(cur.next != null){
                cur = cur.next;
            }
        }
        while (cur.next !=null){
            cur = cur.next;
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }


    public static ListNode getNode(){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2,listNode1);
        ListNode listNode3 = new ListNode(3,listNode2);
        ListNode listNode4 = new ListNode(4,listNode3);
        ListNode listNode5 = new ListNode(5,listNode4);
        return listNode4;
    }
    public static class ListNode {
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
}
