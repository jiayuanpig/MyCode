package LeedCode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Math.pow(10, 0));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);//保留根节点
        ListNode p = l1, q = l2, result = root;
        int carry = 0;//保存进制位

        while (p != null || q != null) {
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            result.next = new ListNode(sum % 10);
            result = result.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry != 0) {
            result.next = new ListNode(carry);
        }
        return root.next;//返回根节点的下一个结点，根节点不存储信息
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
