package 代码随想录.链表;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2023-08-10 10:43
 * @description：  如果是节点之前操作，需要设置虚拟节点。
 * 如果实在结点之后操作，直接修改即可。
 */
public class _707设计链表 {


    public ListNode node;

    public _707设计链表() {



    }

    public int get(int index) {
        int count = 0;
        while (node != null){
            if(count == index){
                return node.val;
            }
            node = node.next;
            count++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode pre = new ListNode(val,node);

    }

    public void addAtTail(int val) {
        while (node !=null){
            node = node.next;
        }
        node.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        ListNode pre = new ListNode(1,node);
        int count=-1;
        while (pre.next!=null){
            count++;
            if(count==val){
                ListNode addNode = new ListNode(val);
                addNode.next = pre.next;
                pre.next = addNode;
            }
        }
    }

    public void deleteAtIndex(int index) {
        ListNode pre = new ListNode(1,node);
        int count=-1;
        while (pre.next !=null){
            count++;
            if(count==index){
            }
        }
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
