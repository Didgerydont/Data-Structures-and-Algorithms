package LinkedListInterviewQuestions.PartitionList;

public class LinkedList {

    private Node head;
    private int length;

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
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void partitionList(int x) {
        // Create two dummy nodes to act as the head of less and greater lists
        Node lessHead = new Node(0);  // Dummy node for the head of 'less' list
        Node greaterHead = new Node(0);  // Dummy node for the head of 'greater' list

        // Pointers to the current last node of less and greater lists
        Node less = lessHead;
        Node greater = greaterHead;

        // Traverse the original linked list
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                // Append to the end of less list
                less.next = current;
                less = less.next;
            } else {
                // Append to the end of greater list
                greater.next = current;
                greater = greater.next;
            }
            current = current.next;
        }

        // Connect the less list to the greater list
        less.next = greaterHead.next;

        // Ensure the end of the new list points to null
        greater.next = null;

        // Update head to point to the new head (skipping dummy node)
        head = lessHead.next;
    }


}

