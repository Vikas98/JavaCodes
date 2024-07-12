package LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
        // Method to add a node at the end
        public void add(Node head,int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        // Method to add a node at the beginning
        public void addFirst(Node head,int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        // Method to add a node at a specific position
        public void addAt(Node head,int index, int data) {
            if (index == 0) {
                addFirst(head,data);
                return;
            }
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current != null) {
                    current = current.next;
                }
            }
            if (current != null) {
                newNode.next = current.next;
                current.next = newNode;
            }
        }

        // Method to remove a node
        public void remove(Node head,int data) {
            if (head == null) return;
            if (head.data == data) {
                head = head.next;
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data != data) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Method to remove a node at a specific position
        public void removeAt(Node head,int index) {
            if (head == null) return;
            if (index == 0) {
                head = head.next;
                return;
            }
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                if (current != null) {
                    current = current.next;
                }
            }
            if (current != null && current.next != null) {
                current.next = current.next.next;
            }
        }

        // Method to search for an element
        public boolean contains(Node head,int data) {
            Node current = head;
            while (current != null) {
                if (current.data == data) {
                    return true;
                }
                current = current.next;
            }
            return false;
        }

        // Method to get the size of the list
        public int size(Node head) {
            int size = 0;
            Node current = head;
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }

        // Method to print the list
        public void printList(Node head) {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        // Method to get an element at a specific index
        public int get(Node head,int index) {
            Node current = head;
            for (int i = 0; i < index; i++) {
                if (current != null) {
                    current = current.next;
                }
            }
            if (current != null) {
                return current.data;
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        // Method to reverse the linked list
        public void reverse(Node head) {
            Node prev = null;
            Node current = head;
            Node next = null;
            while (current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            head = prev;
        }
        public static Node mergeList(Node head1,Node head2)
        {
            Node ans = new Node(-1);
            Node dummyHead = ans;
            while (head1!=null && head2!=null)
            {
                if(head1.data <= head2.data)
                {
                    dummyHead.next = head1;
                    head1=head1.next;
                }
                else
                {
                    dummyHead.next = head2;
                    head2 = head2.next;
                }
                dummyHead=dummyHead.next;
            }
            if(head1==null)
            {
                dummyHead.next = head2;
            }
            else
            {
                dummyHead.next = head1;
            }
            return ans.next;
        }
    }

    public static void main(String[] args) {
     Node head = new Node(10);
//     head.add(head,20);
//     head.add(head,30);
     Node head2 = new Node(5);
     head2.add(head2,6);
     head2.add(head2,8);
     Node head3 = Node.mergeList(head,head2);
     head3.printList(head3);
    }
}
