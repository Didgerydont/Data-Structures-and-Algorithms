package LinkedListInterviewQuestions.FindTheMiddleNode;

public class LinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Find the middle node using the tortoise and hare algorithm.
    public Node findMiddleNode(){
        // initialise two pointers. One named fast, one named slow
        Node slow = head;
        Node fast = head;

        // Traverse the list with the two pointers until the fast pointer reaches the end of the list.
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // fast will move at twice the speed of slow. Once fast reaches the end, slow will be in the middle.
        return slow;

        // In cases where there are an even number of items in the list, the slow pointer will always land on the second middle number
    }


}
