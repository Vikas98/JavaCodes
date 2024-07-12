package LEETCODE;

public class AddTwoNumber {
   static class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d)
        {
            this.data = d;
            this.next = null;
        }
    }
    public static  void createLinkedList(ListNode head,int data)
    {
        ListNode temp = new ListNode(data);
        if(head==null)
        {
            head = temp;
        }
        ListNode temp2 = head;
        while(temp2.next != null)
        {
            temp2=temp2.next;
        }
        temp2.next = temp;
    }
    public static  ListNode addTwoNumber(ListNode l1, ListNode l2)
    {
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        if(l1==null && l2==null) return null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        int n1 ,n2 ,carry = 0;
        while(l1 != null || l2!=null)
        {
            if(l1!=null)
            {
                n1 = l1.data;
                l1=l1.next;
            }
            else
                n1 = 0;
            if(l2!=null)
            {
                n2 = l2.data;
                l2=l2.next;
            }
            else
                n2 = 0;
            int sum = n1+n2+carry;
            curr.next = new ListNode(sum%10);
            carry = sum/10;
            curr = curr.next;
        }
        if(carry != 0)
        {
            ListNode temp = new ListNode(carry);
            curr.next = temp;
        }
        return ans.next;
    }
    public static void display(ListNode head)
    {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        createLinkedList(head,6);
        createLinkedList(head,2);
        createLinkedList(head,5);
        display(head);
        System.out.println();
        createLinkedList(head1,4);
        createLinkedList(head1,5);
        createLinkedList(head1,6);
        display(head1);
        ListNode ans = addTwoNumber(head,head1);
        System.out.println();
        display(ans);
    }
}
