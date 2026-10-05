import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class linkedList {
    
    public static Node deleteBeg(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 8 };
        Node head = convertArrToLL(arr);
        
        System.out.println(deleteBeg(head));
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
