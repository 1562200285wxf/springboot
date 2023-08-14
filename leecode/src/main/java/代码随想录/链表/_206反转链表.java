package 代码随想录.链表;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-10 11:47
 * @description：  反转链表其实就是  从另一侧把链表连接起来。
 */
public class _206反转链表 {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2,listNode1);
        ListNode listNode3 = new ListNode(3,listNode2);
        ListNode listNode4 = new ListNode(4,listNode3);
        ListNode result = reverseList(listNode4);
        System.out.println(result.toString());

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;// 保存下一个节点.同时也是判断下一个阶段的空值
            cur.next = prev;
            prev = cur;
            cur = temp;
            if(cur == null){
                System.out.println("1111111");
            }
        }
        return prev;
    }


    private static class ListNode {
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
