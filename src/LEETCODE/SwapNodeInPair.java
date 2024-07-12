package LEETCODE;

import LinkedList.LinkedList;

public class SwapNodeInPair{
    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node(20);
        head.add(head,10);
        head.add(head,50);
        head.add(head,80);
        head.printList(head);
        //code for swap node in pair
        LinkedList.Node prev = head;
        LinkedList.Node curr = head.next;
        LinkedList.Node ans = curr;
        while (true)
        {
            LinkedList.Node save = curr.next;
            if(save == null|| save.next==null)
            {
                prev.next = save;
                curr.next = prev;
                break;
            }
            prev.next = save.next;
            curr.next = prev;
            prev = save;
            curr = save.next;
        }
        ans.printList(ans);
    }
}
