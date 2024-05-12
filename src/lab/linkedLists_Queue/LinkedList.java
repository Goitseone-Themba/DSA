package lab.linkedLists_Queue;//@author: Goitseone Themba 21000539

import java.util.ArrayList;

public class LinkedList {
    private ListNode head;
    private ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while(curr != null) {
            if (i == index) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public void insertTail(int val)  {
        this.tail.next = new ListNode(val);
        this.tail = this.tail.next;
    }

    public void insertAt(int val, int position) {
        ListNode newNode = new ListNode(val);
        ListNode curr = head;
        int i = 0;
        while (i < position && curr != null) {
            curr = curr.next;
            i++;
        }
        if (curr != null) {
            newNode.next = curr.next;
            curr.next = newNode;
            if (newNode.next == null) {
                tail = newNode;
            }
        }
    }

    public void reverse() {
        if (head == tail) {
            return;
        }

        ListNode prev = null;
        ListNode curr = head.next;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        tail = head.next;
        head.next = prev;
    }
    public boolean remove(int index) {
        int i = 0;
        ListNode curr = this.head;
        while (i < index && curr != null) {
            i++;
            curr = curr.next;
        }

        if (curr != null && curr.next != null) {
            if (curr.next == this.tail) {
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = this.head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}
