package 代码随想录.链表;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-09 16:53
 * @description：
 */
public class _203移除链表元素 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        ListNode listNode = new ListNode(7);
        node.next = listNode;

        System.out.println(removeElements(node,7));
    }



    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        //只需要构造空白节点即可。
        while (temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return dummyHead.next;
    }
}


 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
