package AlgoExpertJavaProblems.AmazonGooglePwcProblems;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode reversed = solution.reverseList(head);

        while (reversed != null) {
            System.out.print(reversed.val + " ");
            reversed = reversed.next;
        }
    }
}

/* Problem: Reverse Linked List - Amazon, Google:

Description: Reverse a singly linked list.

Explanation: This code iterates through the linked list, reversing the direction of pointers.
At each step, the next pointer of the current node is set to the previous node.
The prev and curr pointers move through the list until curr becomes null, indicating the end of the list.*/