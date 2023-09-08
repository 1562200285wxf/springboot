package 代码随想录.链表;

import 代码随想录.链表._19删除倒数第N个节点.ListNode;
/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-14 16:35
 * @description：链表中的环形节点
 */
public class _02链表相交 {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        ListNode pre = new ListNode(0,head);
        ListNode cur = head;
        while (cur.next.next != null){
            if(cur.val == pre.val){
                return null;
            }
        }
        return null;
    }
}
