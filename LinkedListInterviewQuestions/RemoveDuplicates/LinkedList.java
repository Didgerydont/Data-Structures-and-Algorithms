package LinkedListInterviewQuestions.RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;


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


    public void removeDuplicates() {
        // Check if the list is empty or has only one element
        if (head == null || head.next == null) return;

        // Create a hash set to store unique values
        Set<Integer> seen = new HashSet<>();

        Node current = head;
        Node prev = null;
        while (current != null) {
            if (seen.contains(current.value)) {
                // Duplicate found: Remove it
                prev.next = current.next;
            } else {
                // New unique value: Add it to the set
                seen.add(current.value);
                prev = current; // Only move prev if no deletion
            }
            current = current.next;
        }
    }


}

